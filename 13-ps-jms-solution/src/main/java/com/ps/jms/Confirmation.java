package com.ps.ents;

import java.io.Serializable;

/**
 * Created by iuliana.cosmina on 10/9/16.
 */
public class Confirmation implements Serializable {

    private int ackNumber;

    private String verificationComment;

    public Confirmation(int ackNumber, String verificationComment) {
        this.ackNumber = ackNumber;
        this.verificationComment = verificationComment;
    }

    public int getAckNumber() {
        return ackNumber;
    }

    public void setAckNumber(int ackNumber) {
        this.ackNumber = ackNumber;
    }

    public String getVerificationComment() {
        return verificationComment;
    }

    public void setVerificationComment(String verificationComment) {
        this.verificationComment = verificationComment;
    }

    @Override
    public String toString() {
        return "Confirmation{" +
                "ackNumber='" + ackNumber + '\'' +
                ", verificationComment=" + verificationComment +
                '}';
    }
}
