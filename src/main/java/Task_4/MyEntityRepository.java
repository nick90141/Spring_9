package Task_4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {

    MyEntity findBySomeData(String someData);

    MyEntity findByAnotherData(String anotherData);

    @Modifying
    @Query("UPDATE MyEntity e SET e.someData = :newData WHERE e.id = :id")
    void updateDataById(Long id, String newData);

    @Modifying
    @Query("DELETE FROM MyEntity e WHERE e.id = :id")
    void deleteById(Long id);
}
