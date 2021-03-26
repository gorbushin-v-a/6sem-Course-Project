package kurs.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@Document(collection = "australia_item")
public class Item {
    @Id
    private ObjectId _id;

    @Field("id")
    private Long id;

    @Field("coordinates")
    private Map<String, Object> coordinates;

    @Field("tags")
    private List<Tag> tags;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Coordinate> getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(List<Coordinate> coordinates) {
//        this.coordinates = coordinates;
//    }

    public Map<String, Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Map<String, Object> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Item(){

    }

    public Item(Way way){
        this.id = way.getId();
        this.tags = way.getTags();
    }
}
