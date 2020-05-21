package com.synectiks.student.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link AcademicHistorySearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class AcademicHistorySearchRepositoryMockConfiguration {

    @MockBean
    private AcademicHistorySearchRepository mockAcademicHistorySearchRepository;

}
