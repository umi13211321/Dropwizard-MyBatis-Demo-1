package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: transaction
 */
public class Transaction {
    /**
     * Column: transaction_detail_id
     * Type: INT
     */
    private Integer transactionDetailId;

    /**
     * Column: customer_id
     * Type: INT
     */
    private Integer customerId;

    /**
     * Column: txn_id
     * Type: VARCHAR(50)
     */
    private String txnId;

    /**
     * Column: call_id
     * Type: VARCHAR(36)
     */
    private String callId;

    /**
     * Column: service_id
     * Type: VARCHAR(15)
     */
    private String serviceId;

    /**
     * Column: service_name
     * Type: VARCHAR(50)
     */
    private String serviceName;

    /**
     * Column: account_id
     * Type: INT
     */
    private Integer accountId;

    /**
     * Column: amount
     * Type: DECIMAL
     */
    private BigDecimal amount;

    /**
     * Column: sender_vpa
     * Type: VARCHAR(50)
     */
    private String senderVpa;

    /**
     * Column: reciever_vpa
     * Type: VARCHAR(50)
     */
    private String recieverVpa;

    /**
     * Column: txn_status_id
     * Type: TINYINT(3)
     * Remark: 1=success, 2=failed, 3=in progress
     */
    private Byte txnStatusId;

    /**
     * Column: customer_ref_id
     * Type: VARCHAR(20)
     */
    private String customerRefId;

    /**
     * Column: transaction_type
     * Type: INT
     */
    private Integer transactionType;

    /**
     * Column: refund_detail_id
     * Type: INT
     */
    private Integer refundDetailId;

    /**
     * Column: created_at
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date createdAt;

    /**
     * Column: modified_at
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date modifiedAt;

    /**
     * Column: response
     * Type: TEXT
     */
    private String response;

    /**
     * Column: extraData
     * Type: TEXT
     */
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
        this.txnId = txnId == null ? null : txnId.trim();
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId == null ? null : callId.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
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
        this.senderVpa = senderVpa == null ? null : senderVpa.trim();
    }

    public String getRecieverVpa() {
        return recieverVpa;
    }

    public void setRecieverVpa(String recieverVpa) {
        this.recieverVpa = recieverVpa == null ? null : recieverVpa.trim();
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
        this.customerRefId = customerRefId == null ? null : customerRefId.trim();
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
        this.response = response == null ? null : response.trim();
    }

    public String getExtradata() {
        return extradata;
    }

    public void setExtradata(String extradata) {
        this.extradata = extradata == null ? null : extradata.trim();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDetailId=" + transactionDetailId +
                ", customerId=" + customerId +
                ", txnId='" + txnId + '\'' +
                ", callId='" + callId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", accountId=" + accountId +
                ", amount=" + amount +
                ", senderVpa='" + senderVpa + '\'' +
                ", recieverVpa='" + recieverVpa + '\'' +
                ", txnStatusId=" + txnStatusId +
                ", customerRefId='" + customerRefId + '\'' +
                ", transactionType=" + transactionType +
                ", refundDetailId=" + refundDetailId +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", response='" + response + '\'' +
                ", extradata='" + extradata + '\'' +
                '}';
    }
}