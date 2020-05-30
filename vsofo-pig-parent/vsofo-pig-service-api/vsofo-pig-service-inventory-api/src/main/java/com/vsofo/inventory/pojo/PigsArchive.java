package com.vsofo.inventory.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/11 12:09
 * @description PigsArchives
 */
public class PigsArchive implements Serializable {
    private int PIGSARCHIVESID;
    private int STATUSID;
    private int PIGSTYPE;
    private int MAINTAIN;
    private int ISDELETED;
    private int PRODUCTIONSTATUSID;
    private int PRODUCTIONSTATUSDETAILID;
    private Date LASTSTATUSCHANGETIME;
    private int PIGENTERID;
    private Date ADDTIME;
    private int ADDUSERID;
    private String PIGAREA;

    public int getPIGSARCHIVESID() {
        return PIGSARCHIVESID;
    }

    public void setPIGSARCHIVESID(int PIGSARCHIVESID) {
        this.PIGSARCHIVESID = PIGSARCHIVESID;
    }

    public int getSTATUSID() {
        return STATUSID;
    }

    public void setSTATUSID(int STATUSID) {
        this.STATUSID = STATUSID;
    }

    public int getPIGSTYPE() {
        return PIGSTYPE;
    }

    public void setPIGSTYPE(int PIGSTYPE) {
        this.PIGSTYPE = PIGSTYPE;
    }

    public int getMAINTAIN() {
        return MAINTAIN;
    }

    public void setMAINTAIN(int MAINTAIN) {
        this.MAINTAIN = MAINTAIN;
    }

    public int getISDELETED() {
        return ISDELETED;
    }

    public void setISDELETED(int ISDELETED) {
        this.ISDELETED = ISDELETED;
    }

    public int getPRODUCTIONSTATUSID() {
        return PRODUCTIONSTATUSID;
    }

    public void setPRODUCTIONSTATUSID(int PRODUCTIONSTATUSID) {
        this.PRODUCTIONSTATUSID = PRODUCTIONSTATUSID;
    }

    public int getPRODUCTIONSTATUSDETAILID() {
        return PRODUCTIONSTATUSDETAILID;
    }

    public void setPRODUCTIONSTATUSDETAILID(int PRODUCTIONSTATUSDETAILID) {
        this.PRODUCTIONSTATUSDETAILID = PRODUCTIONSTATUSDETAILID;
    }

    public Date getLASTSTATUSCHANGETIME() {
        return LASTSTATUSCHANGETIME;
    }

    public void setLASTSTATUSCHANGETIME(Date LASTSTATUSCHANGETIME) {
        this.LASTSTATUSCHANGETIME = LASTSTATUSCHANGETIME;
    }

    public int getPIGENTERID() {
        return PIGENTERID;
    }

    public void setPIGENTERID(int PIGENTERID) {
        this.PIGENTERID = PIGENTERID;
    }

    public Date getADDTIME() {
        return ADDTIME;
    }

    public void setADDTIME(Date ADDTIME) {
        this.ADDTIME = ADDTIME;
    }

    public int getADDUSERID() {
        return ADDUSERID;
    }

    public void setADDUSERID(int ADDUSERID) {
        this.ADDUSERID = ADDUSERID;
    }

    public String getPIGAREA() {
        return PIGAREA;
    }

    public void setPIGAREA(String PIGAREA) {
        this.PIGAREA = PIGAREA;
    }

    @Override
    public String toString() {
        return "PigsArchive{" +
                "PIGSARCHIVESID=" + PIGSARCHIVESID +
                ", STATUSID=" + STATUSID +
                ", PIGSTYPE=" + PIGSTYPE +
                ", MAINTAIN=" + MAINTAIN +
                ", ISDELETED=" + ISDELETED +
                ", PRODUCTIONSTATUSID=" + PRODUCTIONSTATUSID +
                ", PRODUCTIONSTATUSDETAILID=" + PRODUCTIONSTATUSDETAILID +
                ", LASTSTATUSCHANGETIME=" + LASTSTATUSCHANGETIME +
                ", PIGENTERID=" + PIGENTERID +
                ", ADDTIME=" + ADDTIME +
                ", ADDUSERID=" + ADDUSERID +
                ", PIGAREA='" + PIGAREA + '\'' +
                '}';
    }
}
