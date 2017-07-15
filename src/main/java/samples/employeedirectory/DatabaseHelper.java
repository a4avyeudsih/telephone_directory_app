package samples.employeedirectory;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "employee_directory";

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		/*
		 * Create the employee table and populate it with sample data.
		 * In step 6, we will move these hardcoded statements to an XML document.
		 */
		String sql = "CREATE TABLE IF NOT EXISTS employee (" +
				"_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
				"firstName TEXT, " +
				"lastName TEXT, " +
				"title TEXT, " +
				"officePhone TEXT, " +
				"cellPhone TEXT, " +
				"email TEXT, " +
				"managerId INTEGER)";
		db.execSQL(sql);

		ContentValues values = new ContentValues();

		values.put("firstName", "John");
		values.put("lastName", "Smith");
		values.put("title", "CEO");
		values.put("officePhone", "617-219-2001");
		values.put("cellPhone", "617-456-7890");
		values.put("email", "jsmith@email.com");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Robert");
		values.put("lastName", "Jackson");
		values.put("title", "VP Engineering");
		values.put("officePhone", "617-219-3333");
		values.put("cellPhone", "781-444-2222");
		values.put("email", "rjackson@email.com");
		values.put("managerId", "1");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Marie");
		values.put("lastName", "Potter");
		values.put("title", "VP Sales");
		values.put("officePhone", "617-219-2002");
		values.put("cellPhone", "987-654-3210");
		values.put("email", "mpotter@email.com");
		values.put("managerId", "1");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Lisa");
		values.put("lastName", "Jordan");
		values.put("title", "VP Marketing");
		values.put("officePhone", "617-219-2003");
		values.put("cellPhone", "987-654-7777");
		values.put("email", "ljordan@email.com");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Christophe");
		values.put("lastName", "Coenraets");
		values.put("title", "Evangelist");
		values.put("officePhone", "617-219-0000");
		values.put("cellPhone", "617-666-7777");
		values.put("email", "ccoenrae@adobe.com");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Paula");
		values.put("lastName", "Brown");
		values.put("title", "Director Engineering");
		values.put("officePhone", "617-612-0987");
		values.put("cellPhone", "617-123-9876");
		values.put("email", "pbrown@email.com");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Mark");
		values.put("lastName", "Taylor");
		values.put("title", "Lead Architect");
		values.put("officePhone", "617-444-1122");
		values.put("cellPhone", "617-555-3344");
		values.put("email", "mtaylor@email.com");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Shah Yogesh");
		values.put("lastName", "Kumar");
		values.put("title", "Scientific Officer F, IPSD");
		values.put("officePhone", "022225990465");
		values.put("cellPhone", "9820207642");
		values.put("email", "ykshah@aerb.gov.in");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Eluvathingal Titto");
		values.put("lastName", "Rappai");
		values.put("title", "Scientific Officer F, NPSD");
		values.put("officePhone", "02225990309");
		values.put("cellPhone", "9833216836");
		values.put("email", "titto@aerb.gov.in");
		values.put("managerId", "1");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Dash Sharma Pankaj");
		values.put("lastName", "Kumar");
		values.put("title", "Scientific Officer G, RSD");
		values.put("officePhone", "02225990663");
		values.put("cellPhone", "9769761269");
		values.put("email", "dashsharma@aerb.gov.in");
		values.put("managerId", "1");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Roshan Alayil");
		values.put("lastName", "Divakaran");
		values.put("title", "Scientific Officer G, SSED");
		values.put("officePhone", "02225990452");
		values.put("cellPhone", "9867383009");
		values.put("email", "adroshan@aerb.gov.in");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "KavimanDan");
		values.put("lastName", "Sumeet");
		values.put("title", "Scientific Officer G, NPSD");
		values.put("officePhone", "02225990551");
		values.put("cellPhone", "9619503507");
		values.put("email", "suneet@aerb.gov.in");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Chikkanagoudar Utkarsh");
		values.put("lastName", "Shekhar");
		values.put("title", "Scientific Officer G, NPSD");
		values.put("officePhone", "02225990559");
		values.put("cellPhone", "9820240544");
		values.put("email", "utkarsh@aerb.gov.in");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put("firstName", "Solanki Rajendra");
		values.put("lastName", "Bahadursingh");
		values.put("title", "Scientific Officer F, RSD");
		values.put("officePhone", "02225990319");
		values.put("cellPhone", "9969638838");
		values.put("email", "rajsolanki@aerb.gov.in");
		values.put("managerId", "2");
		db.insert("employee", "lastName", values);

		values.put( "lastName","GHOLAP VAIBHAV PURUSHOTTAM");
		values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION");
		values.put("officePhone","25990320"); values.put("mobile","9969073576");
		values.put("email","vpgholap@aerb.gov.in");
		db.insert("employee","lastname", values);

		values.put( "lastName","SAIYAD NIYAMTULLA USMANBHAI"); values.put("title","SCIENTIFIC ASSISTANT B,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone",""); values.put("mobile","9979571798"); values.put("email","saiyadn@aerb.gov.in"); db.insert("employee","lastname", values);

		values.put( "lastName","PANDE V V"); values.put("title","SCIENTIFIC OFFICER H+,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990413");  values.put("email","vvpande@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","S THIRUMALAISWAMY"); values.put("title","DIRECTOR,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990613");  values.put("email","stswamy@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BISHNOI LALARAM"); values.put("title","DIRECTOR,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990455");  values.put("email","lrbishnoi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KUCHIBHOTLA SRIVASISTA"); values.put("title","SCIENTIFIC OFFICER G,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990608");  values.put("email","ksrivasista@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","SHAH YOGESH KUMAR"); values.put("title","OUTSTANDING SCIENTIST & DIRECTOR,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990465"); values.put("mobile","9820207642"); values.put("email","ykshah@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KRISHNAMURTHY P R"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990511");  values.put("email","prk@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAUL UTTAM KUMAR"); values.put("title","HEAD,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990469");  values.put("email","ukp@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SONAWANE AVINASH UDDHAV"); values.put("title","SCIENTIFIC OFFICER H+,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990655");  values.put("email","dr.avinashs@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAIR HARIKUMAR SREEDHARAN"); values.put("title","SCIENTIFIC OFFICER H,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990571");  values.put("email","harikumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KOLEY JAHARLAL"); values.put("title","SCIENTIFIC OFFICER G,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","25990520");  values.put("email","jkoley@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","C  SENTHIL KUMAR"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","cskumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUPTA RAM PRAKASH"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990568");  values.put("email","rpgupta@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","ELUVATHINGAL TITTO RAPPAI"); values.put("title","SCIENTIFIC OFFICER F,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990309"); values.put("mobile","9833216836"); values.put("email","titto@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHAVE SATISH RAMCHANDRA"); values.put("title","SCIENTIFIC OFFICER F,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990409");  values.put("email","srbhave@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PUTHANPEEDIKAYIL SHYLAMONI"); values.put("title","SCIENTIFIC OFFICER G,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990611");  values.put("email","shyla@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DASH SHARMA PANKAJ KUMAR"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990663"); values.put("mobile","9769761269"); values.put("email","dashsharma@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VANGALA ANURADHA"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990661");  values.put("email","vanuradha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VIJAYAN P"); values.put("title","SCIENTIFIC OFFICER G,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990321");  values.put("email","pvijayan@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","ROSHAN ALAYIL DIVAKARAN"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990452"); values.put("mobile","9867383009"); values.put("email","adroshan@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","KAVIMANDAN SUNEET"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990551"); values.put("mobile","9619503507"); values.put("email","suneet@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHATTACHARYA DIPTOJYOTI"); values.put("title","SCIENTIFIC OFFICER F,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990557");  values.put("email","diptojyoti@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VIRDI PARDEEP SINGH"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990515");  values.put("email","psvirdi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PIPLANI VIVEK"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990507");  values.put("email","vivek@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PRADHAN SRIKRUSHNA KUMAR"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990551");  values.put("email","skpradhan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DUBEY SANTOSH KUMAR"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990459");  values.put("email","skdubey@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAVVA SRINIVASA RAO"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990468");  values.put("email","srini@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","CHIKKANAGOUDAR UTKARSH SHEKHAR"); values.put("title","SCIENTIFIC OFFICER F,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990559"); values.put("mobile","9820240544"); values.put("email","utkarsh@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","SOLANKI RAJENDRA BAHADURSINGH"); values.put("title","SCIENTIFIC OFFICER F,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990319"); values.put("mobile","9969638838"); values.put("email","rajsolanki@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PISHARADY AJAI SETHUMADHAVA"); values.put("title","SCIENTIFIC OFFICER G,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990451"); values.put("mobile","9892298565"); values.put("email","aspisharady@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KHAIDEM RANJANKUMAR SINGH"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990421");  values.put("email","rksingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","INAMDAR MANISHA VINAY"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990667");  values.put("email","mvinamdar@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","GHOLAP VAIBHAV PURUSHOTTAM"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990320"); values.put("mobile","9969073576"); values.put("email","vpgholap@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH BRIJESHKUMAR JALESHWARNATH"); values.put("title","SR.PRINCIPAL PRIVATE SECRETARY,CHAIRMAN OFFICE"); values.put("officePhone","25990671");  values.put("email","bksingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PALAMATTAM RAPHEL JOHN"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990604");  values.put("email","spps@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KODOLKAR SUBHASH MASU"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990419");  values.put("email","smkodolkar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RANE DINESH MADHUKAR"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990671");  values.put("email","dmrane@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHODANKAR NIDHIP MADHUKAR"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990419");  values.put("email","nmchodankar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DHOTRE VIRENDRA RAVINDRANATH"); values.put("title","SCIENTIFIC OFFICER D,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990562");  values.put("email","vrdhotre@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GANESA SIVARAMAN"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990416");  values.put("email","gsivaraman@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","INGAVALE BHARATI HARISH"); values.put("title","SCIENTIFIC OFFICER D,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990552");  values.put("email","bingavale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","UPRETI KAVI"); values.put("title","FOREMAN B,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990254");  values.put("email","kavi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHOITE SHAMRAO SWAMINATH"); values.put("title","TECHNICIAN G,CHAIRMAN OFFICE"); values.put("officePhone","25990309");  values.put("email","sbhoite@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH PURAN"); values.put("title","TECHNICIAN G,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990601");  values.put("email","puransingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KAJANIA BANWARI DHURIA"); values.put("title","SR.PRIVATE SECRETARY,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990508");  values.put("email","nomailid@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHANDRASEKHAR PRASANNA"); values.put("title","SR.PRIVATE SECRETARY,ADMINSTRATION DIVISION"); values.put("officePhone","25990607");  values.put("email","prasanna@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NARAYANAN PERINGETH"); values.put("title","PRIVATE SECRETARY(NS),INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990212");  values.put("email","pn@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAIR MALLIKA CHANDRASHEKHARAN"); values.put("title","PRIVATE SECRETARY(NS),SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990412");  values.put("email","mallika@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOHANDAS LATHA"); values.put("title","SR.PRIVATE SECRETARY,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990456");  values.put("email","latha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAGHAVAN RADHA"); values.put("title","SR.PRIVATE SECRETARY,EXECUTIVE DIRECTOR OFFICE"); values.put("officePhone","25990510");  values.put("email","radha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MENON SHEELA K"); values.put("title","SR.CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990504");  values.put("email","sheela@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHELAR PRATIBHA ABHAY"); values.put("title","ASSISTANT ACCOUNTANT,ACCOUNTS DIVISION"); values.put("officePhone","25990205");  values.put("email","shelar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KAYARAMBEDU PRAKASH VENKATAKRISHNAN"); values.put("title","STENO GRADE I,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990224");  values.put("email","prakash@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAYASHANKAR NEENA"); values.put("title","PUBLIC RELATION ASSISTANT,ADMINSTRATION DIVISION"); values.put("officePhone","25990656");  values.put("email","neena@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KOLI RAMKRISHNA RAMCHANDRA"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990209");  values.put("email","koli@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHETTIGAR SHOBHA MAHABALA"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990213");  values.put("email","shobha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","HARINARAYANAN PARVATI"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990222");  values.put("email","parvathi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MORE JAIRAM KASHINATH"); values.put("title","SCIENTIFIC OFFICER F,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990222");  values.put("email","more@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VALIVETI LAKSHMAN NYAYA"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990402");  values.put("email","lakshman@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAKTODE JITENDRA SADARAM"); values.put("title","SCIENTIFIC OFFICER H,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990205");  values.put("email","jsn@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KODAVANTI SAMARTH RAMPRASAD"); values.put("title","SCIENTIFIC OFFICER G,SOUTHERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","25990610");  values.put("email","ramp@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NEHRU R M"); values.put("title","SCIENTIFIC ASSISTANT E,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990610");  values.put("email","nehru@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VARGHESE SOUMYA"); values.put("title","DRIVER GRADE II,ADMINSTRATION DIVISION"); values.put("officePhone","25990427");  values.put("email","soumya@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RANDHE VIJAY RAMESH"); values.put("title","SCIENTIFIC OFFICER G,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990108");  values.put("email","vrandhe@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PARMAR RANJITSINGH UDAISINGH"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990515");  values.put("email","ruparmar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SEN AMIT"); values.put("title","SCIENTIFIC OFFICER F,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","25990673");  values.put("email","amits@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MISHRA JAGANNATH"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","jmishra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PIMPALE DEVENDRA VASANT"); values.put("title","SCIENTIFIC OFFICER G,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990357");  values.put("email","dvpimpale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MAHALE LAXMIKANT BALU"); values.put("title","SCIENTIFIC OFFICER G,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990315");  values.put("email","mahale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAUT VIKAS VISHNUPANT"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990418"); values.put("mobile","9869039447"); values.put("email","rautvikas@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KULKARNI HEMANT KRISHNA"); values.put("title","ASSISTANT PUBLIC RELATIONS OFFICER,ADMINSTRATION DIVISION"); values.put("officePhone","25990572");  values.put("email","hemantk@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SATHE MADHAV SHRIDHAR"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990207"); values.put("mobile","9869190791"); values.put("email","mssathe@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PRADHAN SANTOSH KUMAR"); values.put("title","SCIENTIFIC OFFICER F,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990466"); values.put("mobile","9869793431"); values.put("email","santosh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAHANI GHANSHYAM"); values.put("title","SCIENTIFIC ASSISTANT D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","25990653"); values.put("mobile","9869872810"); values.put("email","gsahani@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHANDRAMOULI JAYALAKSHMI"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","");  values.put("email",""); db.insert("employee","lastname", values);
		values.put( "lastName","PARAB PRIYA PRASHANT"); values.put("title","STENO GRADE II,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990217");  values.put("email","pparab@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOOPANAR MURGAPERUMAL GANAPATHY"); values.put("title","SCIENTIFIC ASSISTANT D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990462");  values.put("email","moopanar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BOKADE DIPIKA PRAVIN"); values.put("title","DRIVER GRADE II,ADMINSTRATION DIVISION"); values.put("officePhone","25990657");  values.put("email","dipika@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHAIKH FARUK AHMED AZIZ AHMED"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990108"); values.put("mobile","9869470706"); values.put("email","fashaikh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","M  SENTHILKUMAR"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","");  values.put("email","senthil@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KULKARNI ARTI RATNAKAR"); values.put("title","SCIENTIFIC OFFICER E,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990668");  values.put("email","artik@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PATIL PRAVIN JAYWANTRAO"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990670");  values.put("email","pravin@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GANDHI SONAL"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990322");  values.put("email","sonal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH RITU JITENDRA"); values.put("title","SCIENTIFIC OFFICER F,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990467");  values.put("email","ritusingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINHA SOUMEN"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990404"); values.put("mobile","9892798758"); values.put("email","soumen_sinha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAGRALE DHANESH BHAURAO"); values.put("title","SCIENTIFIC OFFICER G,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990466");  values.put("email","dbnagrale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHATTACHARYYA SEKHAR"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990410");  values.put("email","sekharb@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PANDA GOPAL KRUSHNA"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990660");  values.put("email","gkpanda@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHATURVEDI RAJENDRA KUMAR"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990651");  values.put("email","chaturvedi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","AWASTHI UMESH SHYAMSUNDER"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990308");  values.put("email","asumesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PANDEY ALOK"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990670"); values.put("mobile","9594510575"); values.put("email","alok@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAMEIRAKPAM KADAMBINIDEVI"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990668");  values.put("email","kadambinidevi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BISWAS ANIMESH"); values.put("title","SCIENTIFIC OFFICER F,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990557");  values.put("email","abiswas@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ACHARYA SOURAV"); values.put("title","OUTSTANDING SCIENTIST & HEAD,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990457");  values.put("email","sacharya@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VARGHESE C S"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990555");  values.put("email","csv@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NEERAJ KUMAR"); values.put("title","SCIENTIFIC OFFICER G,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990518"); values.put("mobile","9969728280"); values.put("email","neeraj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PATHAK M  K"); values.put("title","SCIENTIFIC OFFICER H+,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","mkpathak@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GHOSH SUJAY KUMAR"); values.put("title","SCIENTIFIC OFFICER F,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990569");  values.put("email","skghosh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DAS DIPTENDU"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990407");  values.put("email","diptendudas@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MUKHERJEE SOUJANYA"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","");  values.put("email","smukherjee@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHRIVASTAVA AVINASH"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990303");  values.put("email","avinash@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHUKLA VIKAS"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990302");  values.put("email","vshukla@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PRABHAKARAN ANUP"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990518");  values.put("email","anup@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ANJIT KUMAR"); values.put("title","STENO GRADE II,EXECUTIVE DIRECTOR OFFICE"); values.put("officePhone","25990562"); values.put("mobile","9969161129"); values.put("email","anjit@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KUSHWAHA DEEPIKA AMITRAJ"); values.put("title","SCIENTIFIC ASSISTANT E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990612");  values.put("email","deepika@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NIKAM SEEMA AVINASH"); values.put("title","SCIENTIFIC ASSISTANT D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990658");  values.put("email","seema@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAISWAL ASHISH SANTLAL"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990329");  values.put("email","ashish@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","OBAIDURRAHMAN KHALILURRAHMAN"); values.put("title","SCIENTIFIC OFFICER E,EXECUTIVE DIRECTOR OFFICE"); values.put("officePhone","25990470");  values.put("email","obaid@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","AGARWAL NILESH"); values.put("title","TECHNICAL OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","nilesh_agrawal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHAIKH SHARMIN YUSUF"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990316");  values.put("email","sharmeen@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MESTRY MILIND SAHADEV"); values.put("title","SCIENTIFIC OFFICER E,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990561");  values.put("email","milindmestry@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BANSAL PARIKSHAT"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990318");  values.put("email","pbansal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MISHRA BIBEKANANDA"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990652");  values.put("email","bibek@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DIXIT PRAMOD KUMAR"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990669");  values.put("email","pramod@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BABURAJAN PARACKAL KUTTY"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990459");  values.put("email","rajan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH MEGHRAJ"); values.put("title","SCIENTIFIC OFFICER F,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990666"); values.put("mobile","9969558698"); values.put("email","meghraj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PANDA ASHIS KUMAR"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990422"); values.put("mobile","9969540056"); values.put("email","ashis@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAIN SURENDRA"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990553");  values.put("email","sjain@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","J V K  SUNIL KUMAR"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990660");  values.put("email","jvksunil@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SANGAM NISHANT KUMAR"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990303");  values.put("email","nishant@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAGAR SUNIL SHANKARRAO"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990307"); values.put("mobile","9029503021"); values.put("email","sunil@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUPTA PANKAJ"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990420");  values.put("email","pnkj_gpt@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DEO ANUJ KUMAR"); values.put("title","SCIENTIFIC ASSISTANT C,SOUTHERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","25990467");  values.put("email","anup@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","S  RENUGA"); values.put("title","SCIENTIFIC ASSISTANT D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","renuga@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DHOKE RAHUL GULABRAO"); values.put("title","SCIENTIFIC OFFICER G,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990327");  values.put("email","rahul@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","TANDON PANKAJ"); values.put("title","SCIENTIFIC OFFICER F,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990659");  values.put("email","drpankaj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","YADAV RAJESH KUMAR"); values.put("title","SCIENTIFIC OFFICER F,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990672");  values.put("email","rajesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAINI MANJU"); values.put("title","SCIENTIFIC OFFICER E,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990658");  values.put("email","manjusaini@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAJOO KUMAR"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990416");  values.put("email","rajookr@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DIXIT NEERAJ"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990664");  values.put("email","neerajdixit@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PORWAL RAHUL"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990563"); values.put("mobile","9757425202"); values.put("email","rahulp@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHARMA SUSHEEL KUMAR"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990317");  values.put("email","skumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KAR SOUMYAJYOTI"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990664");  values.put("email","skar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH HARPAL"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990573"); values.put("mobile","9869807585"); values.put("email","harpal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DASH MANORANJAN"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990357");  values.put("email","dash@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUPTA VIVEK"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990560");  values.put("email","vivekgupta@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PALIWAL PRANAV"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","25990472");  values.put("email","pranav@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH SUDHANSHU SEKAR"); values.put("title","TECHNICAL OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","sudhansu@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUPTA PRADEEP CHANDRA"); values.put("title","SCIENTIFIC OFFICER D,EASTERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","25990311");  values.put("email","pradeep@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUIN ANIRBAN"); values.put("title","SCIENTIFIC OFFICER D,NORTHERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","");  values.put("email","anirbanguin@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHARMA LALIT MOHAN"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone",""); values.put("mobile","9969649713"); values.put("email","lalitmohan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHUKLA RAHUL"); values.put("title","SCIENTIFIC OFFICER E,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990564");  values.put("email","rshukla@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VONTEDDU PHANIKARTHIK"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990407"); values.put("mobile","9757424867"); values.put("email","phani@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PINJARKAR ANAND RAVINDRA"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990661"); values.put("mobile","9920010570"); values.put("email","apinjarkar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JOLLY JOSEPH K"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990651");  values.put("email","jollyjoseph@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BERA SUBRATA"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990464");  values.put("email","sbera@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAJNISH KUMAR"); values.put("title","TECHNICAL OFFICER E,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990553"); values.put("mobile","9757020077"); values.put("email","rajnish@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PV MOHANDAS"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990404");  values.put("email","mohandaspv@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHETE RAJENDRA RAMDAS"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990666"); values.put("mobile","9619166730"); values.put("email","rajendra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAMTEKE ASHISH VISHWANATH"); values.put("title","SCIENTIFIC OFFICER D,NORTHERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","25990651"); values.put("mobile","9773300299"); values.put("email","ashishramteke@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH AJEET"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone",""); values.put("mobile","8976402699"); values.put("email","ajeetsingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NARANATH NAUSHAD"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990676");  values.put("email","naushad@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHANDER VIPIN"); values.put("title","TECHNICAL OFFICER E,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990304");  values.put("email","vipinchander@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHAKRABORTY MOLOY KUMAR"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990451");  values.put("email","mkchakraborty@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","THOKCHOM DEWAN SINGH"); values.put("title","TECHNICAL OFFICER E,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990674");  values.put("email","dewants@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHOUDHARY PINKI"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990408");  values.put("email","pinki@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BEHERA GOUR MOHAN"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990317"); values.put("mobile","9821410478"); values.put("email","gmbehera@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VERMA MAYANK"); values.put("title","SCIENTIFIC OFFICER F,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990567"); values.put("mobile","9619317259"); values.put("email","mayankverma@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","S MAHALAKSHMI"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990662");  values.put("email","lakshmi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","LAKSHMANAN S P"); values.put("title","SCIENTIFIC OFFICER E,SOUTHERN REGIONAL REGULATORY CENTRE"); values.put("officePhone","25990464");  values.put("email","spl@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SUBRAMANIAN CHOCKALINGAM"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","sck@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KULKARNI AMAR MAGAN"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990567");  values.put("email","amark@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DEY SOUMYADIP"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990310"); values.put("mobile","9833584336"); values.put("email","sdey@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GAUBA SIDDHARTHA"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990310");  values.put("email","gauba.siddhartha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PATHAK SUBRATA"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990676");  values.put("email","spathak@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MURALEEDHARAN MAHESH"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990673");  values.put("email","mahesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BOKAM GANESH"); values.put("title","SCIENTIFIC OFFICER E,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990676");  values.put("email","ganeshbokam@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ROY SUSMITA MUKHERJEE"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990457");  values.put("email","susmita@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","AGGARWAL PARIDHI"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990408");  values.put("email","paridhi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VORA ALLARAKHA YUSUF"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990420"); values.put("mobile","8080440273"); values.put("email","allarakha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KUMAR PRADIP"); values.put("title","SCIENTIFIC OFFICER E,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990669");  values.put("email","pradipkumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHA RAJIB LOCHAN"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990653");  values.put("email","rajibsha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHARMA SMRITI"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990662");  values.put("email","smriti@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHARMA PRASHANT"); values.put("title","SCIENTIFIC OFFICER G,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990460");  values.put("email","psharma@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","K UMA SARMA"); values.put("title","SCIENTIFIC OFFICER G,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990566");  values.put("email","kumasarma@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MALHOTRA REETA RANI"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","");  values.put("email","reetamalhotra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAI RAJESHRI H"); values.put("title","SCIENTIFIC OFFICER G,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990662");  values.put("email","rajeshripai@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAWAR SHIVAJI KRISHNA"); values.put("title","SCIENTIFIC OFFICER F,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990306");  values.put("email","skpawar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VYAS SHYAM"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990304");  values.put("email","shyamvyas@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","K M SHIMJA BHANU"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990667");  values.put("email","shimja@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JADHAV RAKESH HARISHCHANDRA"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990214");  values.put("email","rakeshj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAJESH RACHNA"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990223");  values.put("email","rachna@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DHUNDE SHASHI TUKARAM"); values.put("title","ASSISTANT M1,ADMINSTRATION DIVISION"); values.put("officePhone","25990223");  values.put("email","shashi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VENKATACHALAM SRINIVASAN"); values.put("title","UPPER DIVISION CLERK,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990212");  values.put("email","vsvasan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAHASRABUDHE SHWETA"); values.put("title","SCIENTIFIC OFFICER D,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990215");  values.put("email","shweta@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHAILENDRA KUMAR"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990559");  values.put("email","shailendra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GUPTA ANIKET PRAKASH"); values.put("title","SCIENTIFIC OFFICER D,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990471");  values.put("email","aniket.gupta@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JHA SOMNATH"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990457");  values.put("email","somnath@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KAUSHIK POORVA PHALGUNI"); values.put("title","SCIENTIFIC OFFICER H,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990316");  values.put("email","pkaushik@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KULKARNI MAKARAND MADHUKAR"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990570"); values.put("mobile","9869427534"); values.put("email","kulmm@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","UPADHYAY DEVENDRA"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990318"); values.put("mobile","9930290294"); values.put("email","devendra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SANGWAN KULDEEP SINGH"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990328");  values.put("email","kuldeepsingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","TYAGI NISHIKANT"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990302");  values.put("email","ntyagi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BANERJEE AVIMANYU"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990402"); values.put("mobile","9969799856"); values.put("email","avimanyu@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","YADAV ALOK KUMAR"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990225");  values.put("email","alokkumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","AWASTHI SUMIT"); values.put("title","STENO GRADE II,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990307");  values.put("email","sumit@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KAIMAL SINI"); values.put("title","STENO GRADE II,EXECUTIVE DIRECTOR OFFICE"); values.put("officePhone","25990556");  values.put("email","sini@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAWAR RACHANA NILESH"); values.put("title","STENO GRADE II,CHAIRMAN OFFICE"); values.put("officePhone","25990505");  values.put("email","rachana.pawar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAIR RAKHEE PRAVEEN"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990605");  values.put("email","rakhee.nair@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KRISHNAKUMAR NAMITHA"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990657");  values.put("email","namitha.kumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAIR SWATHY KRISHNANKUTTY"); values.put("title","SCIENTIFIC OFFICER F,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990657"); values.put("mobile","9619851042"); values.put("email","swathy.nair@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BUREWAR SWATI VASANTRAO"); values.put("title","TECHNICAL OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990552");  values.put("email","swati@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SURYAWANSHI LAKSHMAN RAJARAM"); values.put("title","TECHNICAL OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990573");  values.put("email","lakshman.surywanshi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHATKHANDE VISHWAJIT VISHNU"); values.put("title","ADMINISTRATIVE OFFICER III,ADMINSTRATION DIVISION"); values.put("officePhone","25990403");  values.put("email","vishvajit@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAKHWA SANGEETA RAJARAM"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990204");  values.put("email","sangeetarn@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DESALE HARSHINAND GULABRAO"); values.put("title","SCIENTIFIC ASSISTANT D,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990652");  values.put("email","harshdesale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MALKAR NARSINJA SAVALARAM"); values.put("title","TECHNICAL OFFICER D,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990327");  values.put("email","nsmalkar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAKESH KUMAR"); values.put("title","SCIENTIFIC OFFICER E,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990403");  values.put("email","rakeshkumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHINTALAPATI NACHIKETA"); values.put("title","DIRECTOR,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990575");  values.put("email","cnachiketa@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GAIKWAD AVINASH JAGANNATH"); values.put("title","SCIENTIFIC OFFICER E,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990461");  values.put("email","avinashg@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KHANDELWAL NARENDRA"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990308");  values.put("email","nkhandelwal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAMAN RUPAK KUMAR"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990472");  values.put("email","rkraman@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KALE VIVEK AMBADAS"); values.put("title","SCIENTIFIC ASSISTANT C,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990472");  values.put("email","vakale@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JEE GOPAL"); values.put("title","SCIENTIFIC ASSISTANT C,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990327");  values.put("email","gopaljee@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KRISHNA KUMAR"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990328");  values.put("email","krishnakumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MALI ARJUN NIMBA"); values.put("title","SCIENTIFIC ASSISTANT C,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990471");  values.put("email","arjunmali@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SVM HASNA"); values.put("title","SCIENTIFIC ASSISTANT C,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990428");  values.put("email","hasna@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MESHRAM SWAPNIL MUNIRAJ"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990328");  values.put("email","swapnil.m@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MANOJ KUMAR"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990576");  values.put("email","manojkumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VASUDEV"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990574");  values.put("email","vasudev@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAMESH KUMAR"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990472");  values.put("email","kramesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MANDAL JAYDEB"); values.put("title","SCIENTIFIC OFFICER D,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990226"); values.put("mobile","9969311663"); values.put("email","jaydeb@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MODAK PAMPA"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990657");  values.put("email","pampa@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BARAL BASUKI"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990226");  values.put("email","basuki@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH BALBIR KUMAR"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990470");  values.put("email","balbir@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SRINIVASAN SADHVI"); values.put("title","SCIENTIFIC ASSISTANT C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990427");  values.put("email","sadhvi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MISHRA MINAKSHI"); values.put("title","SCIENTIFIC ASSISTANT C,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990617");  values.put("email","minakshimishra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ANSARI MOHD  SALEHEEN AZIMUDDIN"); values.put("title","SCIENTIFIC ASSISTANT C,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990675"); values.put("mobile","8291704329"); values.put("email","ansaris@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAWALE GAUTAM B"); values.put("title","SCIENTIFIC ASSISTANT C,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990429");  values.put("email","gautamj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DHUMALE KALYANI PRASAD"); values.put("title","SCIENTIFIC OFFICER E,DIRECTORATE OF REGULATORY INSPECTION"); values.put("officePhone","25990473");  values.put("email","kalyani@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","G SURESH KUMAR"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990560");  values.put("email","sureshkumar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GRANDHI GOPAL"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990564");  values.put("email","gopalgrandhi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","TADICHERLA RAMESH"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990576"); values.put("mobile","9869922048"); values.put("email","tramesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","K V ARBIND KRISHNAN"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990576");  values.put("email","arbindkrish@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RITU RAJ"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","rituraj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GOGAD PRATIK KISHOR"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","");  values.put("email","gogad@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KONER SOUMEN"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990618");  values.put("email","skoner@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAIR DEEPA RAVINDRAN"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990221");  values.put("email","deeparn@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAISWAL ANJU VIJAYPRATAP"); values.put("title","ACCOUNTS OFFICER,ACCOUNTS DIVISION"); values.put("officePhone","25990216");  values.put("email","anjuvjaiswal@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","K  ARUNDHATHI PADMANABHAN"); values.put("title","SCIENTIFIC ASSISTANT C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990219");  values.put("email","arundhathi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JADAV PAVAN"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990429");  values.put("email","pavanjadav@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","CHALLA SHOBHASRI"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990618");  values.put("email","shobhasri@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAKKINA DURGA PRASAD"); values.put("title","SCIENTIFIC ASSISTANT C,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990509");  values.put("email","durgaprasad@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ALAJPUR SANDEEP"); values.put("title","SCIENTIFIC ASSISTANT C,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990473");  values.put("email","sandeep@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ALLAMRAJU SURYA TEJA"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990615");  values.put("email","surya@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","WALHEKAR TANAY SANJAY"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990574");  values.put("email","tanaywalhekar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","RAKESH KUMAR"); values.put("title","SCIENTIFIC OFFICER C,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990471");  values.put("email","rakeshsingh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KARETI MAHESH"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990473");  values.put("email","kmahesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOHANTY ANANYA"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990575");  values.put("email","ananyamohanty@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","AWASTHI PURVA"); values.put("title","SCIENTIFIC OFFICER D,NUCLEAR PROJECTS SAFETY DIVISION"); values.put("officePhone","25990316");  values.put("email","purvadhawan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ROY SUVADIP"); values.put("title","SCIENTIFIC OFFICER C,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990575");  values.put("email","suvadip@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SINGH AMANDEEP"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990614");  values.put("email","aman@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAMANT ARATI RAKESH"); values.put("title","SCIENTIFIC ASSISTANT B,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","25990209");  values.put("email","rtsamant@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","LAKSHMANAN RAJ"); values.put("title","ASSISTANT PERSONNEL OFFICER,ADMINSTRATION DIVISION"); values.put("officePhone","");  values.put("email","rajl@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BALACHANDRAN NALINI"); values.put("title","SCIENTIFIC ASSISTANT C,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990202");  values.put("email","nalinib@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOHAMMAD CHANDPASHA"); values.put("title","UPPER DIVISION CLERK,ACCOUNTS DIVISION"); values.put("officePhone","25990674");  values.put("email","md.chandpasha@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName"," NAIR RHOSHITHA"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990222");  values.put("email","rhoshithanair@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GHATAK SAPTAPARNA SARKAR"); values.put("title","SCIENTIFIC OFFICER D,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990427");  values.put("email","ssarkar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GOSWAMI PAMMY"); values.put("title","SCIENTIFIC ASSISTANT B,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","25990403"); values.put("mobile","9004681362"); values.put("email","pammy@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","TODKAR SACHIN GOVIND"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","sachintodkar@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ARUN ARAVIND"); values.put("title","SCIENTIFIC OFFICER F,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","aravind@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SESHADRI HARIHARAN"); values.put("title","SCIENTIFIC OFFICER F,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","sesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","O S  SEIK MANSOOR ALI"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","seik@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","C  ANANDAN"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","anandan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KRISHNA CHANDRAN"); values.put("title","SCIENTIFIC OFFICER H+,SAFETY RESEARCH INSTITUTE"); values.put("officePhone",""); values.put("mobile","9840260024"); values.put("email","krishnachandranr@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","V  BALASUBRAMANIYAN"); values.put("title","TECHNICAL OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","bala@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","L  THILAGAM"); values.put("title","SCIENTIFIC OFFICER G,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","thilagam@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOHAPATRA D  K"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","dkmohapatra@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KARIBANDI N V  ADINARAYANA"); values.put("title","UPPER DIVISION CLERK,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","adinarayana@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","P  VARADARAJAN"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","pvrajan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ILYAS MOHAMMED LONE"); values.put("title","SCIENTIFIC OFFICER D,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","ilyas@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAGOTI RAMAKRISHNA"); values.put("title","STENO GRADE II,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","pramakrishna@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","HARIKANTRA JAYALAXMI TELU"); values.put("title","SCIENTIFIC ASSISTANT B,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","jayah@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GARG MANSI"); values.put("title","SCIENTIFIC ASSISTANT B,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","mansi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","M R  PRIYA"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","mrpriya@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ABBRUI TEJASWI"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","abburi@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KRISHAN KUMAR"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","krissgoyat@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GADE VENKATA RAJEEV"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","rajeevgade@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","V P  NEERAJ MOHAN"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","neerajmohan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SASHIDHARAN NAKUL"); values.put("title","SCIENTIFIC OFFICER C,SAFETY RESEARCH INSTITUTE"); values.put("officePhone","");  values.put("email","nakul@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","R  KARTHICK"); values.put("title","SCIENTIFIC OFFICER C,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","");  values.put("email","karthikr@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","EDUMUKKALA RAKESH"); values.put("title","SCIENTIFIC OFFICER C,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990457");  values.put("email","rakeshnuke@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","NAYAK MONALISHA"); values.put("title","STENO GRADE III,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990227");  values.put("email","mnayak@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","VATARE SHALAKA SURESH"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990656");  values.put("email","shalaka@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MODI SUCHITA MANAS"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990216");  values.put("email","modi.suchita@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GHOSH  HARADHAN"); values.put("title","SCIENTIFIC OFFICER C,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","25990227");  values.put("email","hghosh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","REDDY KRISHNA"); values.put("title","SCIENTIFIC OFFICER C,INDUSTRIAL PLANTS SAFETY DIVISION"); values.put("officePhone","25990210");  values.put("email","krishnareddy@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","REDDY SEEPIKA"); values.put("title","DY.CONTROLLER OF ACCOUNTS,ACCOUNTS DIVISION"); values.put("officePhone","25990428");  values.put("email","seepikasoin@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PAWAR LAKSHMAN HOONU"); values.put("title","SCIENTIFIC ASSISTANT C,RADIOLOGICAL SAFETY DIVISION"); values.put("officePhone","25990220");  values.put("email","lhp@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SASIDHARAN AJEESH"); values.put("title","DISTINGUISHED SCIENTIST & EXECUTIVE DIRECTOR,EXECUTIVE DIRECTOR OFFICE"); values.put("officePhone","25990676");  values.put("email","ajeesh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHUKLA DINESH KUMAR"); values.put("title","TECHNICIAN C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","25990503"); values.put("mobile","9322699272"); values.put("email","dkshukla@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SHAIKH SAMEER SHABBIR"); values.put("title","SCIENTIFIC OFFICER C,NUCLEAR SAFETY ANALYSIS DIVISION"); values.put("officePhone","25990253");  values.put("email","sameershaikh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BUNGA BHANU PRAKASH"); values.put("title","SCIENTIFIC OFFICER C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","");  values.put("email","bhanu@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","THAMINNI VIVEK RAMA MOORTHY"); values.put("title","SCIENTIFIC OFFICER C,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","");  values.put("email",""); db.insert("employee","lastname", values);
		values.put( "lastName","HARIDAS NIKHIL"); values.put("title","SCIENTIFIC OFFICER C,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","");  values.put("email","nikhilh@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","V ANIS MOHAMMED"); values.put("title","SCIENTIFIC OFFICER D,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone",""); values.put("mobile","9043270202"); values.put("email","amv@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PATEL PURUSHOTHAM"); values.put("title","SCIENTIFIC OFFICER E,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone","");  values.put("email","ppatel@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","C GURUMOORTHY"); values.put("title","CHAIRMAN,CHAIRMAN OFFICE"); values.put("officePhone","");  values.put("email","cgurumoorthy@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","BHARDWAJ SHIV ABHILASH"); values.put("title","ASSISTANT,ADMINSTRATION DIVISION"); values.put("officePhone","25990603");  values.put("email","sabhardwaj@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","ALVE GAUTAMI"); values.put("title","ASSISTANT ACCOUNTANT,ACCOUNTS DIVISION"); values.put("officePhone","25990212");  values.put("email","gautamia@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","DHAKATE VAISHALI ANIL"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","");  values.put("email","vaishaliad@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAIYAD NIYAMTULLA USMANBHAI"); values.put("title","SCIENTIFIC ASSISTANT B,SITING & STRUCTURAL ENGINEERING DIVISION"); values.put("officePhone",""); values.put("mobile","9979571798"); values.put("email","saiyadn@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","S  VIGNESH"); values.put("title","SCIENTIFIC OFFICER C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","");  values.put("email","vigneshs@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MALIK NITIN"); values.put("title","SCIENTIFIC OFFICER C,RESOURCES AND DOCUMENTATION DIVISION"); values.put("officePhone","");  values.put("email","nitinmalik@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","T SAI PRANEETH"); values.put("title","ASSISTANT DIRECTOR (OL),ADMINSTRATION DIVISION"); values.put("officePhone","");  values.put("email","tsp@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","JAIN ABHISHEK"); values.put("title","ASSISTANT ACCOUNTS OFFICER,ACCOUNTS DIVISION"); values.put("officePhone","25990201");  values.put("email","ajain@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","SAJIN VIDYA"); values.put("title","CHIEF ADMINISTRATIVE OFFICER,ADMINSTRATION DIVISION"); values.put("officePhone","25990218");  values.put("email","vigdyasajin@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","MOHAN SHEELA"); values.put("title","ASSISTANT PERSONNEL OFFICER (A4YRS.),ADMINSTRATION DIVISION"); values.put("officePhone","25990233");  values.put("email","sheelam@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","B  LALITHA"); values.put("title","UPPER DIVISION CLERK,ADMINSTRATION DIVISION"); values.put("officePhone","25990203");  values.put("email","lalithab@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","KADAM PRIYAKANT ASHOK"); values.put("title","SCIENTIFIC OFFICER H,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","priyakantanand@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","PADMANABHAN T S"); values.put("title","SCIENTIFIC OFFICER H,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","tspnabhan@aerb.gov.in"); db.insert("employee","lastname", values);
		values.put( "lastName","GARG A P"); values.put("title","SCIENTIFIC OFFICER G,OPERATING PLANTS SAFETY DIVISION"); values.put("officePhone","");  values.put("email","apgarg@aerb.gov.in"); db.insert("employee","lastname", values);
		//values.put( "lastName","ARUNAN J"); values.put("title","); values.put("officePhone","");  values.put("email","jarunan@aerb.gov.in"); db.insert("employee","lastname", values);





	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS employees");
		onCreate(db);
	}

}
