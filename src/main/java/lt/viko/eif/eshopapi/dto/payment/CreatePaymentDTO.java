package lt.viko.eif.eshopapi.dto.payment;

import java.sql.Date;

public class CreatePaymentDTO {

    private Long checkOut_id;
    private double amountPaid;
    private Date paid_at;

    public Long getCheckOut_id() { return checkOut_id; }

    public void setCheckOut_id(Long checkOut_id) { this.checkOut_id = checkOut_id; }

    public double getAmountPaid() { return amountPaid; }

    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }

    public Date getPaid_at() { return paid_at; }

    public void setPaid_at(Date paid_at) { this.paid_at = paid_at; }
}
