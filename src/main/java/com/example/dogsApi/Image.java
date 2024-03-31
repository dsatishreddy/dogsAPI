package com.example.dogsApi;
public class Image {

    private String[] breeds;
    private String[] categories;
    private String id;
    private String url;

   
	public Image(String[] breeds, String[] categories, String id, String url) {
		super();
		this.breeds = breeds;
		this.categories = categories;
		this.id = id;
		this.url = url;
	}

	public String[] getBreeds() {
        return breeds;
    }

    public void setBreeds(String[] breeds) {
        this.breeds = breeds;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
