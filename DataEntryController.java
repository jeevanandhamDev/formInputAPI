package com.interview.formInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/data")
public class DataEntryController {

    @Autowired
    DataEntyRepo repo;

    @PostMapping
        public ResponseEntity<DataEntry> saveData(@RequestBody DataEntry dataEntry) {
        DataEntry savedData = repo.save(dataEntry);
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }

    @GetMapping
    public List<DataEntry> getAllData() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}") // Maps DELETE requests to /api/data/{id}
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
        try {
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        catch (EmptyResultDataAccessException e) {

            return ResponseEntity.notFound().build();
        }
    }
}
