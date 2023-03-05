package mapper;

import static mapper.TransactionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;

import jakarta.ws.rs.DELETE;
import model.Transaction;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TransactionMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {

    @Select("SELECT * FROM transaction")
    @Results({
            @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
            @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
            @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
            @Result(column="service_id", property="serviceId", jdbcType=JdbcType.VARCHAR),
            @Result(column="service_name", property="serviceName", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
            @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
            @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
            @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
            @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
            @Result(column="customer_ref_id", property="customerRefId", jdbcType=JdbcType.VARCHAR),
            @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.INTEGER),
            @Result(column="refund_detail_id", property="refundDetailId", jdbcType=JdbcType.INTEGER),
            @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="response", property="response", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="extraData", property="extradata", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Transaction> findAll();


//    @Select("SELECT * FROM transaction WHERE transaction_detail_id=#{id}")
//    @Results({
//            @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
//            @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="service_id", property="serviceId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="service_name", property="serviceName", jdbcType=JdbcType.VARCHAR),
//            @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
//            @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
//            @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
//            @Result(column="customer_ref_id", property="customerRefId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.INTEGER),
//            @Result(column="refund_detail_id", property="refundDetailId", jdbcType=JdbcType.INTEGER),
//            @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="response", property="response", jdbcType=JdbcType.LONGVARCHAR),
//            @Result(column="extraData", property="extradata", jdbcType=JdbcType.LONGVARCHAR)
//    })
//    Transaction getById(int id);


    @Select("SELECT * FROM transaction WHERE ${column}=#{value}")
    @Results({
            @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
            @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
            @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
            @Result(column="service_id", property="serviceId", jdbcType=JdbcType.VARCHAR),
            @Result(column="service_name", property="serviceName", jdbcType=JdbcType.VARCHAR),
            @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
            @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
            @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
            @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
            @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
            @Result(column="customer_ref_id", property="customerRefId", jdbcType=JdbcType.VARCHAR),
            @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.INTEGER),
            @Result(column="refund_detail_id", property="refundDetailId", jdbcType=JdbcType.INTEGER),
            @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="response", property="response", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="extraData", property="extradata", jdbcType=JdbcType.LONGVARCHAR)
    })
    Transaction getByColumn(@Param("column") String column, @Param("value") String value);



//    @Update("UPDATE transaction SET customer_id=#{customerId}, txn_id=#{txnId}, call_id=#{callId}, amount=#{amount}, sender_vpa=#{senderVpa}, reciever_vpa=#{recieverVpa}, transaction_type=#{transactionType} WHERE transaction_detail_id =#{transactionDetailId}")
//    @Results({
//            @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
//            @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="service_id", property="serviceId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="service_name", property="serviceName", jdbcType=JdbcType.VARCHAR),
//            @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
//            @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
//            @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
//            @Result(column="customer_ref_id", property="customerRefId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.INTEGER),
//            @Result(column="refund_detail_id", property="refundDetailId", jdbcType=JdbcType.INTEGER),
//            @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="response", property="response", jdbcType=JdbcType.LONGVARCHAR),
//            @Result(column="extraData", property="extradata", jdbcType=JdbcType.LONGVARCHAR)
//    })
//    void updateTransaction(Transaction transaction);

//    @Update("UPDATE transaction SET customer_id=#{customerId}, txn_id=#{txnId}, call_id=#{callId}, amount=#{amount}, sender_vpa=#{senderVpa}, reciever_vpa=#{recieverVpa}, transaction_type=#{transactionType} WHERE transaction_detail_id =#{transactionDetailId}")
//    @Results({
//            @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
//            @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
//            @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
//            @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
//    })
//    void updateTransaction(Transaction transaction);

//    @Delete("DELETE FROM transaction WHERE transaction_detail_id=#{id}")
//    void deleteTransaction(int id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    BasicColumn[] selectList = BasicColumn.columnList(transactionDetailId, customerId, txnId, callId, serviceId, serviceName, accountId, amount, senderVpa, recieverVpa, txnStatusId, customerRefId, transactionType, refundDetailId, createdAt, modifiedAt, response, extradata);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Transaction> insertStatement);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TransactionResult", value = {
        @Result(column="transaction_detail_id", property="transactionDetailId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.INTEGER),
        @Result(column="txn_id", property="txnId", jdbcType=JdbcType.VARCHAR),
        @Result(column="call_id", property="callId", jdbcType=JdbcType.VARCHAR),
        @Result(column="service_id", property="serviceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="service_name", property="serviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="sender_vpa", property="senderVpa", jdbcType=JdbcType.VARCHAR),
        @Result(column="reciever_vpa", property="recieverVpa", jdbcType=JdbcType.VARCHAR),
        @Result(column="txn_status_id", property="txnStatusId", jdbcType=JdbcType.TINYINT),
        @Result(column="customer_ref_id", property="customerRefId", jdbcType=JdbcType.VARCHAR),
        @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_detail_id", property="refundDetailId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="response", property="response", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="extraData", property="extradata", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Transaction> selectMany(SelectStatementProvider selectStatement);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TransactionResult")
    Optional<Transaction> selectOne(SelectStatementProvider selectStatement);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int deleteByPrimaryKey(Integer transactionDetailId_) {
        return delete(c -> 
            c.where(transactionDetailId, isEqualTo(transactionDetailId_))
        );
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int insert(Transaction row) {
        return MyBatis3Utils.insert(this::insert, row, transaction, c ->
            c.map(transactionDetailId).toProperty("transactionDetailId")
            .map(customerId).toProperty("customerId")
            .map(txnId).toProperty("txnId")
            .map(callId).toProperty("callId")
            .map(serviceId).toProperty("serviceId")
            .map(serviceName).toProperty("serviceName")
            .map(accountId).toProperty("accountId")
            .map(amount).toProperty("amount")
            .map(senderVpa).toProperty("senderVpa")
            .map(recieverVpa).toProperty("recieverVpa")
            .map(txnStatusId).toProperty("txnStatusId")
            .map(customerRefId).toProperty("customerRefId")
            .map(transactionType).toProperty("transactionType")
            .map(refundDetailId).toProperty("refundDetailId")
            .map(createdAt).toProperty("createdAt")
            .map(modifiedAt).toProperty("modifiedAt")
            .map(response).toProperty("response")
            .map(extradata).toProperty("extradata")
        );
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int insertSelective(Transaction row) {
        return MyBatis3Utils.insert(this::insert, row, transaction, c ->
            c.map(transactionDetailId).toPropertyWhenPresent("transactionDetailId", row::getTransactionDetailId)
            .map(customerId).toPropertyWhenPresent("customerId", row::getCustomerId)
            .map(txnId).toPropertyWhenPresent("txnId", row::getTxnId)
            .map(callId).toPropertyWhenPresent("callId", row::getCallId)
            .map(serviceId).toPropertyWhenPresent("serviceId", row::getServiceId)
            .map(serviceName).toPropertyWhenPresent("serviceName", row::getServiceName)
            .map(accountId).toPropertyWhenPresent("accountId", row::getAccountId)
            .map(amount).toPropertyWhenPresent("amount", row::getAmount)
            .map(senderVpa).toPropertyWhenPresent("senderVpa", row::getSenderVpa)
            .map(recieverVpa).toPropertyWhenPresent("recieverVpa", row::getRecieverVpa)
            .map(txnStatusId).toPropertyWhenPresent("txnStatusId", row::getTxnStatusId)
            .map(customerRefId).toPropertyWhenPresent("customerRefId", row::getCustomerRefId)
            .map(transactionType).toPropertyWhenPresent("transactionType", row::getTransactionType)
            .map(refundDetailId).toPropertyWhenPresent("refundDetailId", row::getRefundDetailId)
            .map(createdAt).toPropertyWhenPresent("createdAt", row::getCreatedAt)
            .map(modifiedAt).toPropertyWhenPresent("modifiedAt", row::getModifiedAt)
            .map(response).toPropertyWhenPresent("response", row::getResponse)
            .map(extradata).toPropertyWhenPresent("extradata", row::getExtradata)
        );
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default Optional<Transaction> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default List<Transaction> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default List<Transaction> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default Optional<Transaction> selectByPrimaryKey(Integer transactionDetailId_) {
        return selectOne(c ->
            c.where(transactionDetailId, isEqualTo(transactionDetailId_))
        );
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, transaction, completer);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    static UpdateDSL<UpdateModel> updateAllColumns(Transaction row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(transactionDetailId).equalTo(row::getTransactionDetailId)
                .set(customerId).equalTo(row::getCustomerId)
                .set(txnId).equalTo(row::getTxnId)
                .set(callId).equalTo(row::getCallId)
                .set(serviceId).equalTo(row::getServiceId)
                .set(serviceName).equalTo(row::getServiceName)
                .set(accountId).equalTo(row::getAccountId)
                .set(amount).equalTo(row::getAmount)
                .set(senderVpa).equalTo(row::getSenderVpa)
                .set(recieverVpa).equalTo(row::getRecieverVpa)
                .set(txnStatusId).equalTo(row::getTxnStatusId)
                .set(customerRefId).equalTo(row::getCustomerRefId)
                .set(transactionType).equalTo(row::getTransactionType)
                .set(refundDetailId).equalTo(row::getRefundDetailId)
                .set(createdAt).equalTo(row::getCreatedAt)
                .set(modifiedAt).equalTo(row::getModifiedAt)
                .set(response).equalTo(row::getResponse)
                .set(extradata).equalTo(row::getExtradata);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Transaction row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(transactionDetailId).equalToWhenPresent(row::getTransactionDetailId)
                .set(customerId).equalToWhenPresent(row::getCustomerId)
                .set(txnId).equalToWhenPresent(row::getTxnId)
                .set(callId).equalToWhenPresent(row::getCallId)
                .set(serviceId).equalToWhenPresent(row::getServiceId)
                .set(serviceName).equalToWhenPresent(row::getServiceName)
                .set(accountId).equalToWhenPresent(row::getAccountId)
                .set(amount).equalToWhenPresent(row::getAmount)
                .set(senderVpa).equalToWhenPresent(row::getSenderVpa)
                .set(recieverVpa).equalToWhenPresent(row::getRecieverVpa)
                .set(txnStatusId).equalToWhenPresent(row::getTxnStatusId)
                .set(customerRefId).equalToWhenPresent(row::getCustomerRefId)
                .set(transactionType).equalToWhenPresent(row::getTransactionType)
                .set(refundDetailId).equalToWhenPresent(row::getRefundDetailId)
                .set(createdAt).equalToWhenPresent(row::getCreatedAt)
                .set(modifiedAt).equalToWhenPresent(row::getModifiedAt)
                .set(response).equalToWhenPresent(row::getResponse)
                .set(extradata).equalToWhenPresent(row::getExtradata);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int updateByPrimaryKey(Transaction row) {
        return update(c ->
            c.set(customerId).equalTo(row::getCustomerId)
            .set(txnId).equalTo(row::getTxnId)
            .set(callId).equalTo(row::getCallId)
            .set(serviceId).equalTo(row::getServiceId)
            .set(serviceName).equalTo(row::getServiceName)
            .set(accountId).equalTo(row::getAccountId)
            .set(amount).equalTo(row::getAmount)
            .set(senderVpa).equalTo(row::getSenderVpa)
            .set(recieverVpa).equalTo(row::getRecieverVpa)
            .set(txnStatusId).equalTo(row::getTxnStatusId)
            .set(customerRefId).equalTo(row::getCustomerRefId)
            .set(transactionType).equalTo(row::getTransactionType)
            .set(refundDetailId).equalTo(row::getRefundDetailId)
            .set(createdAt).equalTo(row::getCreatedAt)
            .set(modifiedAt).equalTo(row::getModifiedAt)
            .set(response).equalTo(row::getResponse)
            .set(extradata).equalTo(row::getExtradata)
            .where(transactionDetailId, isEqualTo(row::getTransactionDetailId))
        );
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    default int updateByPrimaryKeySelective(Transaction row) {
        return update(c ->
            c.set(customerId).equalToWhenPresent(row::getCustomerId)
            .set(txnId).equalToWhenPresent(row::getTxnId)
            .set(callId).equalToWhenPresent(row::getCallId)
            .set(serviceId).equalToWhenPresent(row::getServiceId)
            .set(serviceName).equalToWhenPresent(row::getServiceName)
            .set(accountId).equalToWhenPresent(row::getAccountId)
            .set(amount).equalToWhenPresent(row::getAmount)
            .set(senderVpa).equalToWhenPresent(row::getSenderVpa)
            .set(recieverVpa).equalToWhenPresent(row::getRecieverVpa)
            .set(txnStatusId).equalToWhenPresent(row::getTxnStatusId)
            .set(customerRefId).equalToWhenPresent(row::getCustomerRefId)
            .set(transactionType).equalToWhenPresent(row::getTransactionType)
            .set(refundDetailId).equalToWhenPresent(row::getRefundDetailId)
            .set(createdAt).equalToWhenPresent(row::getCreatedAt)
            .set(modifiedAt).equalToWhenPresent(row::getModifiedAt)
            .set(response).equalToWhenPresent(row::getResponse)
            .set(extradata).equalToWhenPresent(row::getExtradata)
            .where(transactionDetailId, isEqualTo(row::getTransactionDetailId))
        );
    }
}