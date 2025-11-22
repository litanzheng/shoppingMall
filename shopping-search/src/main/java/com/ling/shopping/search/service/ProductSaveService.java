package com.ling.shopping.search.service;

import com.ling.shopping.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;


public interface ProductSaveService {

    boolean saveProductAsIndices(List<SkuEsModel> skuEsModels) throws IOException;
}
