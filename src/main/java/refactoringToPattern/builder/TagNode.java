package refactoringToPattern.builder;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagNode {
    private String name;
    private List<TagNode> children = new ArrayList<>();

    public TagNode(String name){
        this.name = name;
    }

    public void addChildren(TagNode tagNode){
        children.add(tagNode);
    }
}
