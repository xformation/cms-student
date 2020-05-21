package com.synectiks.student.graphql.types.Invoice;

import com.synectiks.student.domain.Invoice;

public class AbstractInvoicePayload {
    private final Invoice invoice;

    public AbstractInvoicePayload(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
