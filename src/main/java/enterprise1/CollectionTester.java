package enterprise1;

import java.util.*;


public class CollectionTester {

    public static ReportBuilder collectionsTester (List list, int size){
        long populate = CollectionsUtils.populate(list,size);
        long add = CollectionsUtils.add(list);
        long remove = CollectionsUtils.remove(list);
        long get = CollectionsUtils.get(list);
        long contains = CollectionsUtils.contains(list);
        long iterAdd = CollectionsUtils.iterAdd(list);
        long iterRemove = CollectionsUtils.iterRemove(list);
        String name = list.getClass().getName() + ": "+ size / 1000+"K";
        ReportBuilder reportBuilder = new ReportBuilder(add, get, remove, contains, populate , iterAdd, iterRemove, name);
        return reportBuilder;

    }
    public static ReportBuilder collectionsTester (Set set, int size){
        long populate = CollectionsUtils.populate(set,size);
        long add = CollectionsUtils.add(set);
        long remove = CollectionsUtils.remove(set);
        long contains = CollectionsUtils.contains(set);
        String name = set.getClass().getName() + ":    "+ size;
        ReportBuilder reportBuilder = new ReportBuilder(add,remove,contains,populate,name);
        return reportBuilder;

    }

}
