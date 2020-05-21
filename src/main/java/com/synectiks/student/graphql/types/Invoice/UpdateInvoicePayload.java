package com.synectiks.student.graphql.types.Invoice;

import com.synectiks.student.domain.Invoice;

public class UpdateInvoicePayload  extends AbstractInvoicePayload{
    public UpdateInvoicePayload(Invoice invoice) {
        super(invoice);
    }
}
