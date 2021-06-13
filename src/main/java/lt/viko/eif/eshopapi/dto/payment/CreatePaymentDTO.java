package lt.viko.eif.eshopapi.dto.payment;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

/**
 * Contains database variables
 * and contains those variable getters and setters
 * @author Lukas, Eimantas, Jonas, Karolis
 * version 1.0
 */
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
