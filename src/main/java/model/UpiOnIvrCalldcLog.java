package model;

import java.util.Date;

/**
 * Table: upi_on_ivr_calldc_log
 */
public class UpiOnIvrCalldcLog {
    /**
     * Column: call_request_id
     * Type: BIGINT UNSIGNED
     */
    private Long callRequestId;

    /**
     * Column: call_id
     * Type: VARCHAR(36)
     */
    private String callId;

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
     * Column: call_start_time
     * Type: DATETIME
     */
    private Date callStartTime;

    /**
     * Column: call_end_time
     * Type: DATETIME
     */
    private Date callEndTime;

    /**
     * Column: service_id
     * Type: VARCHAR(15)
     */
    private String serviceId;

    /**
     * Column: mou
     * Type: INT
     */
    private Integer mou;

    /**
     * Column: is_registered
     * Type: BIT
     * Default value: 0
     */
    private Boolean isRegistered;

    /**
     * Column: is_user_not_allowed_to_call
     * Type: BIT
     * Default value: 0
     */
    private Boolean isUserNotAllowedToCall;

    /**
     * Column: is_customer_blocked
     * Type: BIT
     * Default value: 0
     */
    private Boolean isCustomerBlocked;

    /**
     * Column: is_profile_created
     * Type: BIT
     * Default value: 0
     */
    private Boolean isProfileCreated;

    /**
     * Column: language
     * Type: VARCHAR(20)
     */
    private String language;

    /**
     * Column: service_name
     * Type: VARCHAR(50)
     */
    private String serviceName;

    /**
     * Column: flow_type
     * Type: VARCHAR(50)
     */
    private String flowType;

    /**
     * Column: created_at
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date createdAt;

    /**
     * Column: updated_at
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date updatedAt;

    /**
     * Column: user_ivr_data_value
     * Type: TEXT
     */
    private String userIvrDataValue;

    /**
     * Column: user_trail
     * Type: TEXT
     */
    private String userTrail;

    public Long getCallRequestId() {
        return callRequestId;
    }

    public void setCallRequestId(Long callRequestId) {
        this.callRequestId = callRequestId;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId == null ? null : callId.trim();
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

    public Date getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(Date callStartTime) {
        this.callStartTime = callStartTime;
    }

    public Date getCallEndTime() {
        return callEndTime;
    }

    public void setCallEndTime(Date callEndTime) {
        this.callEndTime = callEndTime;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public Integer getMou() {
        return mou;
    }

    public void setMou(Integer mou) {
        this.mou = mou;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Boolean getIsUserNotAllowedToCall() {
        return isUserNotAllowedToCall;
    }

    public void setIsUserNotAllowedToCall(Boolean isUserNotAllowedToCall) {
        this.isUserNotAllowedToCall = isUserNotAllowedToCall;
    }

    public Boolean getIsCustomerBlocked() {
        return isCustomerBlocked;
    }

    public void setIsCustomerBlocked(Boolean isCustomerBlocked) {
        this.isCustomerBlocked = isCustomerBlocked;
    }

    public Boolean getIsProfileCreated() {
        return isProfileCreated;
    }

    public void setIsProfileCreated(Boolean isProfileCreated) {
        this.isProfileCreated = isProfileCreated;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserIvrDataValue() {
        return userIvrDataValue;
    }

    public void setUserIvrDataValue(String userIvrDataValue) {
        this.userIvrDataValue = userIvrDataValue == null ? null : userIvrDataValue.trim();
    }

    public String getUserTrail() {
        return userTrail;
    }

    public void setUserTrail(String userTrail) {
        this.userTrail = userTrail == null ? null : userTrail.trim();
    }
}