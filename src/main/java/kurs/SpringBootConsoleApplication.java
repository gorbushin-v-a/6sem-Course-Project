package kurs;

import kurs.repository.ItemRepository;
import kurs.repository.NodeRepository;
import kurs.repository.WayRepository;
import kurs.service.BuildGeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private WayRepository wayRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private BuildGeometryService buildGeometryService;

    public static void main(String[] args) {
        //LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
        //LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        buildGeometryService.startThreads(nodeRepository, wayRepository, itemRepository);
    }
}
