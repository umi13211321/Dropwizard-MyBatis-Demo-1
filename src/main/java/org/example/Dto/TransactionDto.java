package org.example.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionDto {

    private Integer transactionDetailId;

    private Integer customerId;

    private String txnId;

    private String callId;

    private String serviceId;

    private String serviceName;

    private Integer accountId;

    private BigDecimal amount;

    private String senderVpa;

    private String recieverVpa;

    private Byte txnStatusId;

    private String customerRefId;

    private Integer transactionType;

    private Integer refundDetailId;

    private Date createdAt;

    private Date modifiedAt;

    private String response;

    private String extradata;

    public Integer getTransactionDetailId() {
        return transactionDetailId;
    }

    public void setTransactionDetailId(Integer transactionDetailId) {
        this.transactionDetailId = transactionDetailId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSenderVpa() {
        return senderVpa;
    }

    public void setSenderVpa(String senderVpa) {
        this.senderVpa = senderVpa;
    }

    public String getRecieverVpa() {
        return recieverVpa;
    }

    public void setRecieverVpa(String recieverVpa) {
        this.recieverVpa = recieverVpa;
    }

    public Byte getTxnStatusId() {
        return txnStatusId;
    }

    public void setTxnStatusId(Byte txnStatusId) {
        this.txnStatusId = txnStatusId;
    }

    public String getCustomerRefId() {
        return customerRefId;
    }

    public void setCustomerRefId(String customerRefId) {
        this.customerRefId = customerRefId;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getRefundDetailId() {
        return refundDetailId;
    }

    public void setRefundDetailId(Integer refundDetailId) {
        this.refundDetailId = refundDetailId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getExtradata() {
        return extradata;
    }

    public void setExtradata(String extradata) {
        this.extradata = extradata;
    }
}
