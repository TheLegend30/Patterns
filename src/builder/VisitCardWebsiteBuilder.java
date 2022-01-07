package builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void builCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPice() {
        website.setPrice(500);
    }
}
