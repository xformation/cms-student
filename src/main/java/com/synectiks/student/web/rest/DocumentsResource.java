package com.synectiks.student.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.synectiks.student.service.DocumentsService;
import com.synectiks.student.service.dto.DocumentsDTO;
import com.synectiks.student.web.rest.errors.BadRequestAlertException;
import com.synectiks.student.web.rest.util.HeaderUtil;

import io.github.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link com.synectiks.student.domain.Documents}.
 */
@RestController
@RequestMapping("/api")
public class DocumentsResource {

    private final Logger log = LoggerFactory.getLogger(DocumentsResource.class);

    private static final String ENTITY_NAME = "studentDocuments";

    private String applicationName;

    private final DocumentsService documentsService;

    public DocumentsResource(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    /**
     * {@code POST  /documents} : Create a new documents.
     *
     * @param documentsDTO the documentsDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new documentsDTO, or with status {@code 400 (Bad Request)} if the documents has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/documents")
    public ResponseEntity<DocumentsDTO> createDocuments(@Valid @RequestBody DocumentsDTO documentsDTO) throws URISyntaxException {
        log.debug("REST request to save Documents : {}", documentsDTO);
        if (documentsDTO.getId() != null) {
            throw new BadRequestAlertException("A new documents cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DocumentsDTO result = documentsService.save(documentsDTO);
        return ResponseEntity.created(new URI("/api/documents/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /documents} : Updates an existing documents.
     *
     * @param documentsDTO the documentsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated documentsDTO,
     * or with status {@code 400 (Bad Request)} if the documentsDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the documentsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/documents")
    public ResponseEntity<DocumentsDTO> updateDocuments(@Valid @RequestBody DocumentsDTO documentsDTO) throws URISyntaxException {
        log.debug("REST request to update Documents : {}", documentsDTO);
        if (documentsDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        DocumentsDTO result = documentsService.save(documentsDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, documentsDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /documents} : get all the documents.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of documents in body.
     */
    @GetMapping("/documents")
    public List<DocumentsDTO> getAllDocuments() {
        log.debug("REST request to get all Documents");
        return documentsService.findAll();
    }

    /**
     * {@code GET  /documents/:id} : get the "id" documents.
     *
     * @param id the id of the documentsDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the documentsDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/documents/{id}")
    public ResponseEntity<DocumentsDTO> getDocuments(@PathVariable Long id) {
        log.debug("REST request to get Documents : {}", id);
        Optional<DocumentsDTO> documentsDTO = documentsService.findOne(id);
        return ResponseUtil.wrapOrNotFound(documentsDTO);
    }

    /**
     * {@code DELETE  /documents/:id} : delete the "id" documents.
     *
     * @param id the id of the documentsDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/documents/{id}")
    public ResponseEntity<Void> deleteDocuments(@PathVariable Long id) {
        log.debug("REST request to delete Documents : {}", id);
        documentsService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString())).build();
    }

    /**
     * {@code SEARCH  /_search/documents?query=:query} : search for the documents corresponding
     * to the query.
     *
     * @param query the query of the documents search.
     * @return the result of the search.
     */
    @GetMapping("/_search/documents")
    public List<DocumentsDTO> searchDocuments(@RequestParam String query) {
        log.debug("REST request to search Documents for query {}", query);
        return documentsService.search(query);
    }

}
