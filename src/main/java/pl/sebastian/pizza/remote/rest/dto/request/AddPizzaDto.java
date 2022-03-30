package pl.sebastian.pizza.remote.rest.dto.request;

import java.util.List;

public class AddPizzaDto {
    private String name;
    private List<AddSizeDto> addSizeDtoList;

    public AddPizzaDto() {
    }

    public AddPizzaDto(String name, List<AddSizeDto> size) {
        this.name = name;
        this.addSizeDtoList = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddSizeDto> getAddSizeDtoList() {
        return addSizeDtoList;
    }

    public void setAddSizeDtoList(List<AddSizeDto> addSizeDtoList) {
        this.addSizeDtoList = addSizeDtoList;
    }
}
