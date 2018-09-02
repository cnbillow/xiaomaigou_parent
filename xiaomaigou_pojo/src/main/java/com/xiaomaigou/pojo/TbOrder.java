package com.xiaomaigou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_order
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.order_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Long orderId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private BigDecimal payment;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String paymentType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.post_fee
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String postFee;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.status
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.create_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date createTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.update_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date updateTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.payment_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date paymentTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.consign_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date consignTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.end_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date endTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.close_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date closeTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.shipping_name
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String shippingName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.shipping_code
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String shippingCode;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.user_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String userId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_message
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String buyerMessage;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_nick
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String buyerNick;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.buyer_rate
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String buyerRate;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.receiver_area_name
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String receiverAreaName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.receiver_mobile
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String receiverMobile;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.receiver_zip_code
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String receiverZipCode;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.receiver
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String receiver;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.expire
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date expire;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.invoice_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String invoiceType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.source_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String sourceType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.seller_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String sellerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.order_id
     *
     * @return the value of tb_order.order_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.order_id
     *
     * @param orderId the value for tb_order.order_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment
     *
     * @return the value of tb_order.payment
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment
     *
     * @param payment the value for tb_order.payment
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment_type
     *
     * @return the value of tb_order.payment_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment_type
     *
     * @param paymentType the value for tb_order.payment_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.post_fee
     *
     * @return the value of tb_order.post_fee
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.post_fee
     *
     * @param postFee the value for tb_order.post_fee
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.status
     *
     * @return the value of tb_order.status
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.status
     *
     * @param status the value for tb_order.status
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.create_time
     *
     * @return the value of tb_order.create_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.create_time
     *
     * @param createTime the value for tb_order.create_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.update_time
     *
     * @return the value of tb_order.update_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.update_time
     *
     * @param updateTime the value for tb_order.update_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.payment_time
     *
     * @return the value of tb_order.payment_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.payment_time
     *
     * @param paymentTime the value for tb_order.payment_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.consign_time
     *
     * @return the value of tb_order.consign_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.consign_time
     *
     * @param consignTime the value for tb_order.consign_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.end_time
     *
     * @return the value of tb_order.end_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.end_time
     *
     * @param endTime the value for tb_order.end_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.close_time
     *
     * @return the value of tb_order.close_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.close_time
     *
     * @param closeTime the value for tb_order.close_time
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.shipping_name
     *
     * @return the value of tb_order.shipping_name
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.shipping_name
     *
     * @param shippingName the value for tb_order.shipping_name
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.shipping_code
     *
     * @return the value of tb_order.shipping_code
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.shipping_code
     *
     * @param shippingCode the value for tb_order.shipping_code
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.user_id
     *
     * @return the value of tb_order.user_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.user_id
     *
     * @param userId the value for tb_order.user_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_message
     *
     * @return the value of tb_order.buyer_message
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_message
     *
     * @param buyerMessage the value for tb_order.buyer_message
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_nick
     *
     * @return the value of tb_order.buyer_nick
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_nick
     *
     * @param buyerNick the value for tb_order.buyer_nick
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.buyer_rate
     *
     * @return the value of tb_order.buyer_rate
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getBuyerRate() {
        return buyerRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.buyer_rate
     *
     * @param buyerRate the value for tb_order.buyer_rate
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate == null ? null : buyerRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.receiver_area_name
     *
     * @return the value of tb_order.receiver_area_name
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.receiver_area_name
     *
     * @param receiverAreaName the value for tb_order.receiver_area_name
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setReceiverAreaName(String receiverAreaName) {
        this.receiverAreaName = receiverAreaName == null ? null : receiverAreaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.receiver_mobile
     *
     * @return the value of tb_order.receiver_mobile
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.receiver_mobile
     *
     * @param receiverMobile the value for tb_order.receiver_mobile
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.receiver_zip_code
     *
     * @return the value of tb_order.receiver_zip_code
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.receiver_zip_code
     *
     * @param receiverZipCode the value for tb_order.receiver_zip_code
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode == null ? null : receiverZipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.receiver
     *
     * @return the value of tb_order.receiver
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.receiver
     *
     * @param receiver the value for tb_order.receiver
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.expire
     *
     * @return the value of tb_order.expire
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.expire
     *
     * @param expire the value for tb_order.expire
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.invoice_type
     *
     * @return the value of tb_order.invoice_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.invoice_type
     *
     * @param invoiceType the value for tb_order.invoice_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.source_type
     *
     * @return the value of tb_order.source_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.source_type
     *
     * @param sourceType the value for tb_order.source_type
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.seller_id
     *
     * @return the value of tb_order.seller_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.seller_id
     *
     * @param sellerId the value for tb_order.seller_id
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postFee=").append(postFee);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", consignTime=").append(consignTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", shippingName=").append(shippingName);
        sb.append(", shippingCode=").append(shippingCode);
        sb.append(", userId=").append(userId);
        sb.append(", buyerMessage=").append(buyerMessage);
        sb.append(", buyerNick=").append(buyerNick);
        sb.append(", buyerRate=").append(buyerRate);
        sb.append(", receiverAreaName=").append(receiverAreaName);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", receiverZipCode=").append(receiverZipCode);
        sb.append(", receiver=").append(receiver);
        sb.append(", expire=").append(expire);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}