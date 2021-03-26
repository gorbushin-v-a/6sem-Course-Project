package kurs.service;

import kurs.model.Item;
import kurs.model.Node;
import kurs.model.Way;
import kurs.repository.ItemRepository;
import kurs.repository.NodeRepository;
import kurs.repository.WayRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

@Service
public class BuildGeometryService {

    int page;

    public void startThreads(NodeRepository nodeRepository, WayRepository wayRepository, ItemRepository itemRepository){
        Node node = nodeRepository.findById(379807L);
        System.out.println(node.get_id());
        Way way = wayRepository.findById(1986084L);
        System.out.println(way.get_id());
        //itemRepository.save(new Item());
        //List<Way> ways = wayRepository.findFirst100By_id();
        //Page<Way> ways = wayRepository.findAllBy_id(PageRequest.of(0,10));
        ///
        Page<Way> ways = wayRepository.findAll(PageRequest.of(0,10));
        Way w = ways.getContent().get(0);
        Item i = new Item(w);
        List<Long> l = w.getNodeIds();
        Long lo = l.get(0);
        Node nodel = nodeRepository.findById(lo);
        Map<String, Object> coordinates = new Map<String, Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(String key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ?> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Object> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Object>> entrySet() {
                return null;
            }
        };
        Object p = nodel.getLocation().get("coordinates");
        coordinates.put("test",p);
        i.setCoordinates(coordinates);
        ///
        page = 0;
    }

    public void getAndPutData(WayRepository wayRepository){
        int size = 100;
        Page<Way> ways = wayRepository.findAll(PageRequest.of(page, size));
        page+=size;
        ///
        ///
    }
}
