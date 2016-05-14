package enterprise1;


public class ReportBuilder {
    private long add;
    private long get;
    private long remove;
    private long contains;
    private long populate;
    private long iterAdd;
    private long iterRemove;
    private String name;

    public long getAdd() {
        return add;
    }

    public long getGet() {
        return get;
    }

    public long getRemove() {
        return remove;
    }

    public long getContains() {
        return contains;
    }

    public long getPopulate() {
        return populate;
    }

    public long getIterAdd() {
        return iterAdd;
    }

    public long getIterRemove() {
        return iterRemove;
    }

    public String getName() {
        return name;
    }

    public ReportBuilder(long add, long remove, long contains, long populate, String name) {
        this.add = add;
        this.remove = remove;
        this.contains = contains;
        this.populate = populate;
        this.name = name;
    }

    public ReportBuilder( long add,long get, long remove, long contains, long populate, long iterAdd, long iterRemove, String name) {
        this.get = get;
        this.add = add;
        this.remove = remove;
        this.contains = contains;
        this.populate = populate;
        this.iterAdd = iterAdd;
        this.iterRemove = iterRemove;
        this.name = name;
    }
    public String writeReport (){
        String log ="This "+this.getName()+"\t add: \t"+this.getAdd()+"\t get: "+this.getGet()+"\t remove: \t"+this.getRemove()+"\t contains: \t"+this.getContains()
                +"\t populate: \t"+this.getPopulate()+"\t iterAdd: \t"+this.getIterAdd()+"\t iterRemove: \t"+this.getIterRemove()+" .\n";
        return log;


    }

}
