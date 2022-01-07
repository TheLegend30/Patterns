package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void builCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPice() {
        website.setPrice(10000);
    }
}
