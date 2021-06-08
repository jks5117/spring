package problem;

//1. 생성자에 파라미터가 들어가면 밖에서 선언안 한 변수도 선언을 안에서 할 수 있게 된다.

public class Sansungza2 {
     private int    uid_no      = 0; //유니크한 순번
     private int    zipcode     = 0; //우편번호
     private String zdo         = "";//시도
     private String sigu        = "";//시구
     private String dong        = "";//동 -LIKE 패턴으로 구간 검색시 사용할 컬럼명임
     private String ri          = "";//리
     private String bungi       = "";//번지
     private String aptname     = "";//아파트이름
     private String upd_date    = "";//수정날짜
     private String address     = "";//주소

   public Sansungza2(int uid_no, int zipcode, String zdo
               , String sigu, String dong, String ri
               , String aptname, String upd_date, String address) {
        this.uid_no      =   uid_no    ; //유니크한 순번//유니크한 순번
        this.zipcode     =   zipcode   ; //우편번호//우편번호
        this.zdo         =   zdo       ;//시도//시도
        this.sigu        =   sigu      ;//시구//시구
        this.dong        =   dong      ;//동 -LIKE 패턴으로 구간 검색시 사용할 컬럼명임//동 -LIKE 패턴으로 구간 검색시 사용할 컬럼명임
        this.ri          =   ri        ;//리
        this.aptname     =   aptname   ;//아파트이름//아파트이름
        this.upd_date    =   upd_date  ;//수정날짜//수정날짜
        this.address     =   address   ;//주소//주소
      
      
   }   
   public static void main(String[] args) {
      Sansungza2 A3 = new Sansungza2(1,20321,"서울시","동작구","면목동"
            ,"3번리","수정아파트","202022","인천구");//**3번예시 = 이렇게 간단+private를 선언 가능
      System.out.println(A3.uid_no+A3.zipcode);
      //만약 3번 같은 경우 이걸 쓰지 않는다면 이렇게 긴 코드가 되겠죠 일일히 setter를 초기화할때마다 불러와야하고!
      //A3.setUid_no(1)
      //A3.setZipcode(20321)
      //A3.setZdo("서울시")
      //A3.setSigu("동작구")
      //A3.setDong("면목동")
      //A3.setRi("3번리")
      //A3.setAptname("수정아파트")
      //A3.setUpd_date("202022")
      //A3.setApd_date("인천구")
   }

}