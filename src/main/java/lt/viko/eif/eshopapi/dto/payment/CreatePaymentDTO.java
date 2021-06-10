package lt.viko.eif.eshopapi.dto.payment;

import java.sql.Date;

public class CreatePaymentDTO {

    private Long checkOutId;
    private double amountPaid;
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
