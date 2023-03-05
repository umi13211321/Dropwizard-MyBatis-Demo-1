package mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class TransactionDynamicSqlSupport {
    public static final Transaction transaction = new Transaction();

    public static final SqlColumn<Integer> transactionDetailId = transaction.transactionDetailId;

    public static final SqlColumn<Integer> customerId = transaction.customerId;

    public static final SqlColumn<String> txnId = transaction.txnId;

    public static final SqlColumn<String> callId = transaction.callId;

    public static final SqlColumn<String> serviceId = transaction.serviceId;

    public static final SqlColumn<String> serviceName = transaction.serviceName;

    public static final SqlColumn<Integer> accountId = transaction.accountId;

    public static final SqlColumn<BigDecimal> amount = transaction.amount;

    public static final SqlColumn<String> senderVpa = transaction.senderVpa;

    public static final SqlColumn<String> recieverVpa = transaction.recieverVpa;

    public static final SqlColumn<Byte> txnStatusId = transaction.txnStatusId;

    public static final SqlColumn<String> customerRefId = transaction.customerRefId;

    public static final SqlColumn<Integer> transactionType = transaction.transactionType;

    public static final SqlColumn<Integer> refundDetailId = transaction.refundDetailId;

    public static final SqlColumn<Date> createdAt = transaction.createdAt;

    public static final SqlColumn<Date> modifiedAt = transaction.modifiedAt;

    public static final SqlColumn<String> response = transaction.response;

    public static final SqlColumn<String> extradata = transaction.extradata;

    public static final class Transaction extends AliasableSqlTable<Transaction> {
        public final SqlColumn<Integer> transactionDetailId = column("transaction_detail_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> customerId = column("customer_id", JDBCType.INTEGER);

        public final SqlColumn<String> txnId = column("txn_id", JDBCType.VARCHAR);

        public final SqlColumn<String> callId = column("call_id", JDBCType.VARCHAR);

        public final SqlColumn<String> serviceId = column("service_id", JDBCType.VARCHAR);

        public final SqlColumn<String> serviceName = column("service_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> accountId = column("account_id", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> amount = column("amount", JDBCType.DECIMAL);

        public final SqlColumn<String> senderVpa = column("sender_vpa", JDBCType.VARCHAR);

        public final SqlColumn<String> recieverVpa = column("reciever_vpa", JDBCType.VARCHAR);

        public final SqlColumn<Byte> txnStatusId = column("txn_status_id", JDBCType.TINYINT);

        public final SqlColumn<String> customerRefId = column("customer_ref_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> transactionType = column("transaction_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> refundDetailId = column("refund_detail_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifiedAt = column("modified_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> response = column("response", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> extradata = column("extraData", JDBCType.LONGVARCHAR);

        public Transaction() {
            super("transaction", Transaction::new);
        }
    }
}