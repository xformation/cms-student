package com.synectiks.student.graphql.types.Invoice;

import com.synectiks.student.domain.Invoice;

public class AddInvoicePayload extends AbstractInvoicePayload {
    public AddInvoicePayload(Invoice invoice) {
        super(invoice);
    }
}
