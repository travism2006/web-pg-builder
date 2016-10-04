
/*XHTML IT 207 Web Page Builder*/
public class Page implements it207Const
{
   private String title;
   private boolean isIndex;
   private String authorName;
   private String template;
   
   public Page()
   {this(null,false,null,null);}
   
   public Page(String aTitle)
   {this(aTitle, false, null, null);}

   public Page(boolean isIndexPg)
   {this(null, isIndexPg, null, null);}

   public Page(String aTitle, boolean isIndexPg, String anAuthor, String someTemplate)
   {
      this.title = aTitle;
      this.isIndex = isIndexPg;
      this.authorName = anAuthor;
      this.template = someTemplate;
   }
   
   public boolean setPgTitle(String someName)
   {
      if(someName.equals(null) || someName.length() == 0){return false;}
      else{this.title = someName;return true;}
   }
}