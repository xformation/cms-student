package com.synectiks.student.graphql.types.Invoice;

import java.util.List;

import com.synectiks.student.domain.Invoice;

public class RemoveInvoicePayload {
    private final List<Invoice> invoices;

    public RemoveInvoicePayload(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
}
