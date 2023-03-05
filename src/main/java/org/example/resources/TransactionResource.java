package org.example.resources;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import model.Transaction;
import org.example.Dto.TransactionDto;
import org.example.service.TransactionService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Path("/transaction")
@Produces(MediaType.APPLICATION_JSON)
public class TransactionResource {
    @GET
    public List<TransactionDto> findAll(){
        TransactionService transactionService= new TransactionService();
        List<Transaction> transactionList = transactionService.findAll();
        List<TransactionDto> transactionDtoList = new ArrayList<>();
        System.out.println("size "+transactionList.size());

        for(Transaction transaction : transactionList){
            TransactionDto transactionDto = new TransactionDto();
            transactionDto.setTransactionDetailId(transaction.getTransactionDetailId());
            transactionDto.setCustomerId(transaction.getCustomerId());
            transactionDto.setTxnId(transaction.getTxnId());
            transactionDto.setCallId(transaction.getCallId());
            transactionDto.setServiceId(transaction.getServiceId());
            transactionDto.setServiceName(transaction.getServiceName());
            transactionDto.setAccountId(transaction.getAccountId());
            transactionDto.setAmount(transaction.getAmount());
            transactionDto.setSenderVpa(transaction.getSenderVpa());
            transactionDto.setRecieverVpa(transaction.getRecieverVpa());
            transactionDto.setTxnStatusId(transaction.getTxnStatusId());
            transactionDto.setCustomerRefId(transaction.getCustomerRefId());
            transactionDto.setTransactionType(transaction.getTransactionType());
            transactionDto.setResponse(transaction.getResponse());
            transactionDto.setExtradata(transaction.getExtradata());
            transactionDto.setRefundDetailId(transaction.getRefundDetailId());
            transactionDto.setCreatedAt(transaction.getCreatedAt());
            transactionDto.setModifiedAt(transaction.getModifiedAt());
            transactionDtoList.add(transactionDto);
        }
        System.out.println("size "+transactionList.size());
        return transactionDtoList;
    }

    @GET
    @Path("/{transactionId}")
    public TransactionDto getById(@PathParam("transactionId") int id){
        TransactionService transactionService= new TransactionService();
        Transaction transaction = transactionService.getById(id);
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setTransactionDetailId(transaction.getTransactionDetailId());
        transactionDto.setCustomerId(transaction.getCustomerId());
        transactionDto.setTxnId(transaction.getTxnId());
        transactionDto.setCallId(transaction.getCallId());
        transactionDto.setServiceId(transaction.getServiceId());
        transactionDto.setServiceName(transaction.getServiceName());
        transactionDto.setAccountId(transaction.getAccountId());
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setSenderVpa(transaction.getSenderVpa());
        transactionDto.setRecieverVpa(transaction.getRecieverVpa());
        transactionDto.setTxnStatusId(transaction.getTxnStatusId());
        transactionDto.setCustomerRefId(transaction.getCustomerRefId());
        transactionDto.setTransactionType(transaction.getTransactionType());
        transactionDto.setResponse(transaction.getResponse());
        transactionDto.setExtradata(transaction.getExtradata());
        transactionDto.setRefundDetailId(transaction.getRefundDetailId());
        transactionDto.setCreatedAt(transaction.getCreatedAt());
        transactionDto.setModifiedAt(transaction.getModifiedAt());

        return transactionDto;
    }

    @POST
    public TransactionDto insertTransactionDto(TransactionDto transactionDto){
        TransactionService transactionService= new TransactionService();
        Transaction transaction = new Transaction();
        transaction.setTransactionDetailId(transactionDto.getTransactionDetailId());
        transaction.setCustomerId(transactionDto.getCustomerId());
        transaction.setTxnId(transactionDto.getTxnId());
        transaction.setCallId(transactionDto.getCallId());
        transaction.setServiceId(transactionDto.getServiceId());
        transaction.setServiceName(transactionDto.getServiceName());
        transaction.setAccountId(transactionDto.getAccountId());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setSenderVpa(transactionDto.getSenderVpa());
        transaction.setRecieverVpa(transactionDto.getRecieverVpa());
        transaction.setTxnStatusId(transactionDto.getTxnStatusId());
        transaction.setCustomerRefId(transactionDto.getCustomerRefId());
        transaction.setTransactionType(transactionDto.getTransactionType());
        transaction.setResponse(transactionDto.getResponse());
        transaction.setExtradata(transactionDto.getExtradata());
        transaction.setRefundDetailId(transactionDto.getRefundDetailId());
        transaction.setCreatedAt(transactionDto.getCreatedAt());
        transaction.setModifiedAt(transactionDto.getModifiedAt());

        Transaction t1 = transactionService.insertTransaction(transaction);
        transactionDto.setTransactionDetailId(t1.getTransactionDetailId());
        return transactionDto;
    }

    @PUT
    public TransactionDto updateTransactionDto(TransactionDto transactionDto){
        System.out.println("Update satrt");
        TransactionService transactionService= new TransactionService();
        Transaction transaction = new Transaction();
        transaction.setTransactionDetailId(transactionDto.getTransactionDetailId());
        transaction.setCustomerId(transactionDto.getCustomerId());
        transaction.setTransactionDetailId(transactionDto.getTransactionDetailId());
        transaction.setTxnId(transactionDto.getTxnId());
        transaction.setCallId(transactionDto.getCallId());
        transaction.setServiceId(transactionDto.getServiceId());
        transaction.setServiceName(transactionDto.getServiceName());
        transaction.setAccountId(transactionDto.getAccountId());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setSenderVpa(transactionDto.getSenderVpa());
        transaction.setRecieverVpa(transactionDto.getRecieverVpa());
        transaction.setTxnStatusId(transactionDto.getTxnStatusId());
        transaction.setCustomerRefId(transactionDto.getCustomerRefId());
        transaction.setTransactionType(transactionDto.getTransactionType());
        transaction.setResponse(transactionDto.getResponse());
        transaction.setExtradata(transactionDto.getExtradata());
        transaction.setRefundDetailId(transactionDto.getRefundDetailId());
        transaction.setCreatedAt(transactionDto.getCreatedAt());
        transaction.setModifiedAt(transactionDto.getModifiedAt());

        Transaction t1 = transactionService.updateTransaction(transaction);
        transactionDto.setTransactionDetailId(t1.getTransactionDetailId());
        return transactionDto;
    }

    @DELETE
    @Path("/{transactionId}")
    public String deleteTransaction(@PathParam("transactionId") int id){
        TransactionService transactionService= new TransactionService();
        Boolean flag = transactionService.deleteTransaction(id);

        if(flag) {
            return "Transaction is deleted";
        } else{
            return "No Transaction exist with this Transaction Id";
        }
    }


}
