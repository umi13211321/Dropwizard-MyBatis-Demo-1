package org.example.service;

import mapper.TransactionMapper;
import model.Transaction;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TransactionService {

    Reader reader;
    {
        try {
            reader = Resources.getResourceAsReader("test.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  static SqlSessionFactory sqlSessionFactory;

    public List<Transaction> findAll(){
        try(SqlSession session = sqlSessionFactory.openSession()){
            TransactionMapper transactionMapper = session.getMapper(TransactionMapper.class);
            List<Transaction> list = transactionMapper.findAll();
            return list;
        }
    }
    public Transaction getById(int id) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            TransactionMapper transactionMapper = session.getMapper(TransactionMapper.class);
            Transaction transaction = transactionMapper.getByColumn("transaction_detail_id", String.valueOf(id));
            return transaction;
        }
    }
    public Transaction insertTransaction(Transaction transaction) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            TransactionMapper transactionMapper = session.getMapper(TransactionMapper.class);

            System.out.println("checkpoint insertTransaction: ");
            transactionMapper.insertSelective(transaction);
            System.out.println("end insert user");
            session.commit();

            return transactionMapper.getByColumn("txn_id", transaction.getTxnId());
        }
    }
    public Transaction updateTransaction(Transaction transaction) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
//            session.getConfiguration().addMapper(TransactionMapper.class);
            TransactionMapper transactionMapper = session.getMapper(TransactionMapper.class);

            System.out.println("checkpoint update Transaction: ");
            transactionMapper.updateByPrimaryKey(transaction);
            System.out.println("end update Transaction");
            session.commit();

            return transaction;
        }
    }
    public boolean deleteTransaction(int id) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            TransactionMapper transactionMapper = session.getMapper(TransactionMapper.class);
            System.out.println("checkpoint delete Transaction: ");
            int n = transactionMapper.deleteByPrimaryKey(id);
            System.out.println("end delete Transaction");
            session.commit();

            if(n==0){
                return false;
            } else{
                return true;
            }
        }
    }
}

