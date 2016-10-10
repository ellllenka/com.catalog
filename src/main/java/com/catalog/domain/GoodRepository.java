package com.catalog.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lena on 09.06.16.
 */
@Repository
public interface GoodRepository extends PagingAndSortingRepository<Good, Integer> {
    //Page<Good> findByIsStocked(Pageable pageable);
}
