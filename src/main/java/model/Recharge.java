package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: recharge
 */
public class Recharge {
    /**
     * Column: recharge_id
     * Type: INT
     */
    private Integer rechargeId;

    /**
     * Column: customer_id
     * Type: INT
     */
    private Integer customerId;

    /**
     * Column: recharge_status
     * Type: BIT
     * Default value: 0
     */
    private Boolean rechargeStatus;

    /**
     * Column: validation_status
     * Type: BIT
     * Default value: 3
     */
    private Boolean validationStatus;

    /**
     * Column: telecom_circle_id
     * Type: INT
     */
    private Integer telecomCircleId;

    /**
     * Column: msisdn_recharged
     * Type: VARCHAR(25)
     */
    private String msisdnRecharged;

    /**
     * Column: amount
     * Type: DECIMAL
     */
    private BigDecimal amount;

    /**
     * Column: status
     * Type: TINYINT(3)
     * Default value: 3
     */
    private Byte status;

    /**
     * Column: recharge_extra_type
     * Type: VARCHAR(25)
     */
    private String rechargeExtraType;

    /**
     * Column: telecom_operator_id
     * Type: INT
     */
    private Integer telecomOperatorId;

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
     * Column: customer_ref_id
     * Type: VARCHAR(30)
     */
    private String customerRefId;

    /**
     * Column: partner_txn_id
     * Type: VARCHAR(50)
     */
    private String partnerTxnId;

    /**
     * Column: partner_auth_code
     * Type: VARCHAR(50)
     */
    private String partnerAuthCode;

    /**
     * Column: recharge_info
     * Type: VARCHAR(500)
     */
    private String rechargeInfo;

    /**
     * Column: biller_master_id
     * Type: INT
     */
    private Integer billerMasterId;

    /**
     * Column: biller_category_id
     * Type: INT
     */
    private Integer billerCategoryId;

    /**
     * Column: vendor_recharge_id
     * Type: VARCHAR(200)
     */
    private String vendorRechargeId;

    /**
     * Column: vendor_txn_id
     * Type: VARCHAR(100)
     */
    private String vendorTxnId;

    /**
     * Column: recharge_interface
     * Type: ENUM(16)
     */
    private String rechargeInterface;

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
     * Column: validation_raw_response
     * Type: MEDIUMTEXT
     */
    private String validationRawResponse;

    /**
     * Column: recharge_raw_response
     * Type: MEDIUMTEXT
     */
    private String rechargeRawResponse;

    public Integer getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(Integer rechargeId) {
        this.rechargeId = rechargeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Boolean getRechargeStatus() {
        return rechargeStatus;
    }

    public void setRechargeStatus(Boolean rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    public Boolean getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(Boolean validationStatus) {
        this.validationStatus = validationStatus;
    }

    public Integer getTelecomCircleId() {
        return telecomCircleId;
    }

    public void setTelecomCircleId(Integer telecomCircleId) {
        this.telecomCircleId = telecomCircleId;
    }

    public String getMsisdnRecharged() {
        return msisdnRecharged;
    }

    public void setMsisdnRecharged(String msisdnRecharged) {
        this.msisdnRecharged = msisdnRecharged == null ? null : msisdnRecharged.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRechargeExtraType() {
        return rechargeExtraType;
    }

    public void setRechargeExtraType(String rechargeExtraType) {
        this.rechargeExtraType = rechargeExtraType == null ? null : rechargeExtraType.trim();
    }

    public Integer getTelecomOperatorId() {
        return telecomOperatorId;
    }

    public void setTelecomOperatorId(Integer telecomOperatorId) {
        this.telecomOperatorId = telecomOperatorId;
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

    public String getCustomerRefId() {
        return customerRefId;
    }

    public void setCustomerRefId(String customerRefId) {
        this.customerRefId = customerRefId == null ? null : customerRefId.trim();
    }

    public String getPartnerTxnId() {
        return partnerTxnId;
    }

    public void setPartnerTxnId(String partnerTxnId) {
        this.partnerTxnId = partnerTxnId == null ? null : partnerTxnId.trim();
    }

    public String getPartnerAuthCode() {
        return partnerAuthCode;
    }

    public void setPartnerAuthCode(String partnerAuthCode) {
        this.partnerAuthCode = partnerAuthCode == null ? null : partnerAuthCode.trim();
    }

    public String getRechargeInfo() {
        return rechargeInfo;
    }

    public void setRechargeInfo(String rechargeInfo) {
        this.rechargeInfo = rechargeInfo == null ? null : rechargeInfo.trim();
    }

    public Integer getBillerMasterId() {
        return billerMasterId;
    }

    public void setBillerMasterId(Integer billerMasterId) {
        this.billerMasterId = billerMasterId;
    }

    public Integer getBillerCategoryId() {
        return billerCategoryId;
    }

    public void setBillerCategoryId(Integer billerCategoryId) {
        this.billerCategoryId = billerCategoryId;
    }

    public String getVendorRechargeId() {
        return vendorRechargeId;
    }

    public void setVendorRechargeId(String vendorRechargeId) {
        this.vendorRechargeId = vendorRechargeId == null ? null : vendorRechargeId.trim();
    }

    public String getVendorTxnId() {
        return vendorTxnId;
    }

    public void setVendorTxnId(String vendorTxnId) {
        this.vendorTxnId = vendorTxnId == null ? null : vendorTxnId.trim();
    }

    public String getRechargeInterface() {
        return rechargeInterface;
    }

    public void setRechargeInterface(String rechargeInterface) {
        this.rechargeInterface = rechargeInterface == null ? null : rechargeInterface.trim();
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

    public String getValidationRawResponse() {
        return validationRawResponse;
    }

    public void setValidationRawResponse(String validationRawResponse) {
        this.validationRawResponse = validationRawResponse == null ? null : validationRawResponse.trim();
    }

    public String getRechargeRawResponse() {
        return rechargeRawResponse;
    }

    public void setRechargeRawResponse(String rechargeRawResponse) {
        this.rechargeRawResponse = rechargeRawResponse == null ? null : rechargeRawResponse.trim();
    }
}