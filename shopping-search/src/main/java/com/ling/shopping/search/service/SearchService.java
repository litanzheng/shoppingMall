package com.ling.shopping.search.service;

import com.ling.shopping.search.vo.SearchParam;
import com.ling.shopping.search.vo.SearchResult;

public interface SearchService {
    SearchResult getSearchResult(SearchParam searchParam);
}
