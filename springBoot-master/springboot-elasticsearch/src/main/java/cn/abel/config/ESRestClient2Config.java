package cn.abel.config;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 第二数据源
 *
 * @author yyb
 * @time 2020/4/2
 */
@Configuration
public class ESRestClient2Config {
    public static final String NAME = "ESRestClient2Config";

    @Value("${elasticsearch2.userName}")
    private String userName;
    @Value("${elasticsearch2.password}")
    private String password;
    @Value("${elasticsearch2.rest.hostNames}")
    private String hostName;
    @Value("${elasticsearch2.rest.port}")
    private Integer port;

    @Bean(name = NAME, destroyMethod = "close")
    public RestClient getRestClient() {
        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY,
                new UsernamePasswordCredentials(userName, password));
        RestClientBuilder restClientBuilder = RestClient.builder(new HttpHost(hostName, port));
        //配置身份验证
        restClientBuilder.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
            @Override
            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
            }
        });
        return restClientBuilder.build();
    }
}
