package lt.viko.eif.eshopapi.dto.payment;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class CreatePaymentDTO {

    private Long checkOutId;
    private double amountPaid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date paidAt;

    public Long getCheckOutId() {
        return checkOutId;
    }

    public void setCheckOutId(Long checkOutId) {
        this.checkOutId = checkOutId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

}
