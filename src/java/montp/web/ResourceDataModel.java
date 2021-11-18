package montp.web;

import montp.data.model.Resource;

import montp.services.ResourceService;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@ViewScoped
public class ResourceDataModel extends LazyDataModel<Resource> {

    @Inject
    private ResourceService  resourceService;

    @Override
    public List<Resource> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
        String filter = "";
        setRowCount(resourceService.count().intValue());
        return resourceService.getAll(first, pageSize, filter);
    }

    @Override
    public String getRowKey(Resource object) {
        return object.getId().toString();
    }

    @Override
    public Resource getRowData(String rowKey) {
        return resourceService.get(Integer.parseInt(rowKey));
    }

}
