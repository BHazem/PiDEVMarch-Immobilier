package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Property;
import immobi.tec.immobitec.repositories.PropertyRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class ServicePropertyTest {

    @Mock
    private PropertyRepository propertyRepository;

    @InjectMocks
    private ServiceProperty serviceProperty;

    @Test
    void getPropertyById() {
    }

    @Test
    void addProperty() {
        Property property = new Property().builder().description("Description").build();
        Property propresultat = serviceProperty.addProperty (1,property);
        assertThat(propresultat).isNotNull();
        assertThat(propresultat.getId_property()).isNotNull();

        Property property1 = propertyRepository.findById(2).get();
        assertThat(property1).isNotNull();
    }
}