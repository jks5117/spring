(function()
{
    return function()
    {
        if (!this._is_form)
            return;
        
        var obj = null;
        
        this.on_create = function()
        {
            this.set_name("deptManager");
            this.set_titletext("New Form");
            if (Form == this.constructor)
            {
                this._setFormPosition(1280,720);
            }
            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("ds_dept", this);
            obj._setContents("<ColumnInfo><Column id=\"deptno\" type=\"INT\" size=\"5\"/><Column id=\"dname\" type=\"STRING\" size=\"50\"/><Column id=\"loc\" type=\"STRING\" size=\"100\"/></ColumnInfo><Rows><Row><Col id=\"deptno\">10</Col><Col id=\"dname\">총무부</Col><Col id=\"loc\">인천</Col></Row><Row><Col id=\"deptno\">20</Col><Col id=\"dname\">영업부</Col><Col id=\"loc\">서울</Col></Row><Row><Col id=\"deptno\">30</Col><Col id=\"dname\">개발부</Col><Col id=\"loc\">서귀포</Col></Row></Rows>");
            this.addChild(obj.name, obj);
            
            // UI Components Initialize
            obj = new Static("lb_dept","35","9","151","61",null,null,null,null,null,null,this);
            obj.set_taborder("0");
            obj.set_text("부서관리");
            obj.set_textAlign("center");
            this.addChild(obj.name, obj);

            obj = new Grid("Grid00","80","120","652","337",null,null,null,null,null,null,this);
            obj.set_taborder("1");
            obj.set_binddataset("ds_dept");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"80\"/><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row band=\"head\" size=\"24\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell text=\"부서번호\"/><Cell col=\"1\" text=\"부서명\"/><Cell col=\"2\" text=\"지역\"/></Band><Band id=\"body\"><Cell text=\"bind:deptno\"/><Cell col=\"1\" text=\"bind:dname\"/><Cell col=\"2\" text=\"bind:loc\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Button("btn_cel","80","85","111","25",null,null,null,null,null,null,this);
            obj.set_taborder("2");
            obj.set_text("조회");
            this.addChild(obj.name, obj);

            obj = new Button("btn_cel00","201","85","111","25",null,null,null,null,null,null,this);
            obj.set_taborder("3");
            obj.set_text("입력");
            this.addChild(obj.name, obj);

            obj = new Button("btn_cel00_00","321","85","111","25",null,null,null,null,null,null,this);
            obj.set_taborder("4");
            obj.set_text("수정");
            this.addChild(obj.name, obj);

            obj = new Button("btn_cel00_01","441","85","111","25",null,null,null,null,null,null,this);
            obj.set_taborder("5");
            obj.set_text("삭제");
            this.addChild(obj.name, obj);

            // Layout Functions
            //-- Default Layout : this
            obj = new Layout("default","",1280,720,this,function(p){});
            obj.set_mobileorientation("landscape");
            this.addLayout(obj.name, obj);
            
            // BindItem Information

        };
        
        this.loadPreloadList = function()
        {

        };
        
        // User Script
        this.registerScript("deptManager.xfdl", function() {

        this.lb_dept_onclick = function(obj,e)
        {

        };

        });
        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.lb_dept.addEventHandler("onclick",this.lb_dept_onclick,this);
        };

        this.loadIncludeScript("deptManager.xfdl");
        this.loadPreloadList();
        
        // Remove Reference
        obj = null;
    };
}
)();
