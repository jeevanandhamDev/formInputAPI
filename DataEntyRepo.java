package com.interview.formInput;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataEntyRepo extends JpaRepository<DataEntry,Long> {
}
