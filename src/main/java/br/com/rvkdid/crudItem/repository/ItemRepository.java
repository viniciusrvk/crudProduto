package br.com.rvkdid.crudItem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rvkdid.crudItem.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
