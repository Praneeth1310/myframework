package com.thd.base.Constants;

import com.thd.common.utils.PropertyUtil;

public class Constants
{
    public static final int DEFAULT_WAIT_FOR_ELEMENT =
            Integer.parseInt(PropertyUtil.getProp().getProperty("default.wait.for.element"));

    public static final int DEFAULT_WAIT_FOR_PAGE =
            Integer.parseInt(PropertyUtil.getProp().getProperty("default.wait.for.page"));

    public static final int DEFAULT_TIMEOUT_IMPLICITWAIT =
            Integer.parseInt(PropertyUtil.getProp().getProperty("default.timeout.implicitwait"));

    public static final int DEFAULT_TIMEOUT_EXPLICITWAIT =
            Integer.parseInt(PropertyUtil.getProp().getProperty("default.timeout.explicitwait"));

    //Url
    public static final String P1_LOGINURL = String.format(PropertyUtil.getProp().getProperty("base.url"),"homedepot2");
    public static final String P1_USERNAME = PropertyUtil.getProp().getProperty("p1.userName");
    public static final String P1_PASSWORD = PropertyUtil.getProp().getProperty("p1.password");

    public static final String P2_LOGINURL = String.format(PropertyUtil.getProp().getProperty("base.url"),"homedepot4");
    public static final String P2_USERNAME = PropertyUtil.getProp().getProperty("p2.userName");
    public static final String P2_PASSWORD = PropertyUtil.getProp().getProperty("p2.password");
    public static final String BPURL = PropertyUtil.getProp().getProperty("bp.url");
    public static final String HCMURL = PropertyUtil.getProp().getProperty("hcm.url");
    public static final String AUDITURL = PropertyUtil.getProp().getProperty("audit.url");

    //SSO
    public static final String SANDBOX_LOGINURL = PropertyUtil.getProp().getProperty("base_sandbox.url");
    public static final String SANDBOX_USERNAME = PropertyUtil.getProp().getProperty("sandbox.userName");
    public static final String SANDBOX_PASSWORD = PropertyUtil.getProp().getProperty("sandbox.password");
    public static final String SANDBOX_ENC_USERNAME = PropertyUtil.getProp().getProperty("sandbox.encrypted.uername");
    public static final String SANDBOX_ENC_PASSWORD = PropertyUtil.getProp().getProperty("sandbox.encrypted.password");

    public static final String HD3_LOGINURL = PropertyUtil.getProp().getProperty("hd3.url");
    public static final String HD3_ENC_USERNAME = PropertyUtil.getProp().getProperty("hd3.encrypted.uername");
    public static final String HD3_ENC_PASSWORD = PropertyUtil.getProp().getProperty("hd3.encrypted.password");

    public static final String PRVW_TENANT = PropertyUtil.getProp().getProperty("preview_tenant.url");
    public static final String PRVW_TENANT_USERNAME = PropertyUtil.getProp().getProperty("prvwTenant.encrypted.uername");
    public static final String PRVW_TENANT_PASSWORD = PropertyUtil.getProp().getProperty("prvwTenant.encrypted.password");




    //Start Proxy name
    public static final String NAMESTARTPROXY = PropertyUtil.getProp().getProperty("name.startproxy");
    public static final String HR_PARTNER = PropertyUtil.getProp().getProperty("name.HRPartner");
    public static final String HR_PARTNER_0914 = PropertyUtil.getProp().getProperty("name.HRPartner0914");
    public static final String HR_PARTNER2 = PropertyUtil.getProp().getProperty("name.HRPartner2");
    public static final String HR_PARTNER_7052 = PropertyUtil.getProp().getProperty("name.HRPartner7052");
    public static final String BP_Admin = PropertyUtil.getProp().getProperty("name.BPAdmin");
    public static final String Comp_Admin = PropertyUtil.getProp().getProperty("name.CompAdmin");
    public static final String Talent_admin = PropertyUtil.getProp().getProperty("name.TalentAdmin");
    public static final String Talent_admin_7052 = PropertyUtil.getProp().getProperty("name.TalentAdmin7052");
    public static final String Talent_admin_0914 = PropertyUtil.getProp().getProperty("name.TalentAdmin0914");
    public static final String Absence_Admin = PropertyUtil.getProp().getProperty("name.AbsenceAdmin");
    public static final String Absence_Admin_Canada = PropertyUtil.getProp().getProperty("name.AbsenceAdminCanada");
    public static final String succession_partner_7152 = PropertyUtil.getProp().getProperty("name.successionpartner");
    public static final String succession_partner_7052 = PropertyUtil.getProp().getProperty("name.successionpartner7052");
    public static final String Manager_7152_DonaldCrete = PropertyUtil.getProp().getProperty("name.ManagerDonaldCrete");
    public static final String Manager_7052 = PropertyUtil.getProp().getProperty("name.Manager7052");
    public static final String Manager_0914 = PropertyUtil.getProp().getProperty("name.Manager0914");
    public static final String Manager_6351 = PropertyUtil.getProp().getProperty("name.Manager6351");



    public static final String PayRoll_Admin = PropertyUtil.getProp().getProperty("name.PayRollAdmin");
    public static final String Security_Partner = PropertyUtil.getProp().getProperty("name.SecurityPartner");


    //search box search
    public static final String SRCHBOXSTPROXY = PropertyUtil.getProp().getProperty("search.startproxy");
    public static final String SRCHBOXSTOPPROXY = PropertyUtil.getProp().getProperty("search.stopproxy");
    public static final String SRCHBOXCREATEPOSITION = PropertyUtil.getProp().getProperty("search.createposition");
    public static final String SRCHHIREEMP = PropertyUtil.getProp().getProperty("search.hireemployee");
    public static final String SRCHCREATEPREHIRE = PropertyUtil.getProp().getProperty("search.createprehire");
    public static final String SRCHPREHIRENAMES = PropertyUtil.getProp().getProperty("search.prehirenames");
    public static final String SRCHCHANGEJOB = PropertyUtil.getProp().getProperty("search.changejob");
    public static final String SRCHCHANGEMYPERSONALINFO = PropertyUtil.getProp().getProperty("search.changepersonalinfo");
    public static final String SRCHCREATEJOBREQ = PropertyUtil.getProp().getProperty("search.createjobrequestion");
    public static final String SRCHREQCOMPCHANGE = PropertyUtil.getProp().getProperty("search.ReqChangeComp");
    public static final String SRCHREQONETIMEPAYMENT = PropertyUtil.getProp().getProperty("search.reqonetimepayment");
    public static final String SRCHSTARTPERFREVIEW = PropertyUtil.getProp().getProperty("search.startperformanceReview");
    public static final String SRCHSTARTTALNTREVIEW = PropertyUtil.getProp().getProperty("search.startTalentReview");
    public static final String SRCHCONTRACTCW = PropertyUtil.getProp().getProperty("search.contractCW");
    public static final String SRCHENDCCW = PropertyUtil.getProp().getProperty("search.endContingentWorkerContract");
    public static final String SRCHMOVEWORKERS = PropertyUtil.getProp().getProperty("search.moveWorkers");
    public static final String SRCHCREATESUCCESSIONPLAN = PropertyUtil.getProp().getProperty("search.createsuccessionplan");
    public static final String SRCHVIEWSUCCESSIONPLAN = PropertyUtil.getProp().getProperty("search.viewsuccessionplan");
    public static final String SRCHMANAGESUCCESSIONPLAN = PropertyUtil.getProp().getProperty("search.managesuccessionplan");
    public static final String SRCHLEGALNAMECHANGE = PropertyUtil.getProp().getProperty("search.legalnamechange");
    public static final String SRCHEDITSERVICEDATE = PropertyUtil.getProp().getProperty("search.editservicedate");
    public static final String SRCHCHANGEMYPREFERREDNAME = PropertyUtil.getProp().getProperty("search.changemypreferredname");
    public static final String SRCHASSIGNPAYGROUP = PropertyUtil.getProp().getProperty("search.assignpaygroup");





    public static final String HRPartner_7152 = PropertyUtil.getProp().getProperty("name.HRPartner7152");


    //US Hire Employee
   public static final String USAPOSITIONCREATEPOSHIREEMP = PropertyUtil.getProp().getProperty("usapositioncreatepos.hireemployee");
    public static final String USARECRUITSTARTDATEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usarecruitstartdateJobReq.hireemployee");
    public static final String USATARGETHIREDATEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usatargethiredateJobReq.hireemployee");
    public static final String USAWORKERTYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usaworkertypeJobReq.hireemployee");
    public static final String USAREASONJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usareasonJobReq.hireemployee");
    public static final String USAEMPSUBTYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usaempsubtypeJobReq.hireemployee");
    public static final String USATIMETYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usatimetypeJobReq.hireemployee");
    public static final String USAPRIMARYLOCJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usaprimarylocJobReq.hireemployee");
    public static final String USACOMPANYJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usacompanyJobReq.hireemployee");
    public static final String USACOSTCENTERJOBREQHIREEMP = PropertyUtil.getProp().getProperty("usacostcenterJobReq.hireemployee");
    public static final String USASUPORGHIREEMP = PropertyUtil.getProp().getProperty("usasuporg.hireempployee");
    public static final String USAREASONHIREEMP = PropertyUtil.getProp().getProperty("usareason.hireemployee");
    public static final String USAPOSHIREEMP = PropertyUtil.getProp().getProperty("usaposition.hireemployee");
    public static final String USAEMPTYPEHIREEMP = PropertyUtil.getProp().getProperty("usaemptype.hireemployee");
    public static final String USAJOBPROFILEHIREEMP = PropertyUtil.getProp().getProperty("usajobprofile.hireemployee");
    public static final String USAPAYRATETYPEHIREEMP = PropertyUtil.getProp().getProperty("usaparratetype.hireemployee");
    public static final String USATIMETYPEHIREEMP = PropertyUtil.getProp().getProperty("usatimetype.hireemployee");
    public static final String USALOCATIONHIREEMP = PropertyUtil.getProp().getProperty("usalocation.hireemployee");
    public static final String COUNTRYUSAHIRE = PropertyUtil.getProp().getProperty("usacountry.hireempCanada");

    public static final String USACOUNTRYEMAIL = PropertyUtil.getProp().getProperty("usacountry.email");
    public static final String USASSNEMAIL = PropertyUtil.getProp().getProperty("usassn.email");
    public static final String USASSNNUMBEMAIL = PropertyUtil.getProp().getProperty("usassnnumb.email");
    public static final String USACOMPANYHIREEMP = PropertyUtil.getProp().getProperty("usacompany.hireemployee");
    public static final String USACOSTCENTERHIREEMP = PropertyUtil.getProp().getProperty("usacostcenter.hireemployee");
    public static final String USABUSINESSUNITHIREEMP = PropertyUtil.getProp().getProperty("usabusinessunit.hireemployee");
    public static final String USADEPARTMENTHIREEMP = PropertyUtil.getProp().getProperty("usadepartment.hireemployee");
    public static final String USAGOVIDHIREEMP = PropertyUtil.getProp().getProperty("usagovID.hireemployee");
    public static final String USASSNHIREEMP = PropertyUtil.getProp().getProperty("usassn.hireemployee");
    public static final String USAAMOUNTHIREEMP = PropertyUtil.getProp().getProperty("usaamount.hireemployee");
    public static final String USAFNEMERGENCYCONTACTONB = PropertyUtil.getProp().getProperty("usaFNemergencyConctOnBoard.hireemployee");
    public static final String USALNEMERGENCYCONTACTONB = PropertyUtil.getProp().getProperty("usaLNemergencyConctOnBoard.hireemployee");
    public static final String USARELATIONSHPONB = PropertyUtil.getProp().getProperty("usarelationShpOnB.hireemployee");
    public static final String USAMAILIDONB = PropertyUtil.getProp().getProperty("usamailIdOnB.hireemployee");
    public static final String USAMOBILEONB = PropertyUtil.getProp().getProperty("usamobileOnboard.hireemployee");
    public static final String USCANADARACEONB = PropertyUtil.getProp().getProperty("usraceOnboardCanada.hireemployee");
    public static final String USARACEONB = PropertyUtil.getProp().getProperty("usaraceOnboardUSA.hireemployee");

    public static final String USAVETERENONB = PropertyUtil.getProp().getProperty("usaveteranOnboardUSA.hireemployee");

    public static final String USAEMPDOBONB = PropertyUtil.getProp().getProperty("usaemployeeDOB.hireemployee");
    public static final String USABANKNAMEONB = PropertyUtil.getProp().getProperty("usabanknameOnB.hireemployee");
    public static final String USABANKINSTNNUMBONB = PropertyUtil.getProp().getProperty("usainstitutionNum.hireemployee");
    public static final String USABANKBRANCHIDONB = PropertyUtil.getProp().getProperty("usabranchId.hireemployee");
    public static final String USABANKACCNUMBERONB = PropertyUtil.getProp().getProperty("usaaccountnum.hireemployee");
    public static final String USAROUTINGTRANSITNUMBERONB = PropertyUtil.getProp().getProperty("usaroutingTransitNbrOnB.hireemployee");
    public static final String USABANKIDNUMBERONB = PropertyUtil.getProp().getProperty("usabankIdentificationCodeOnB.hireemployee");
    public static final String USBANKBRANCHIDONB = PropertyUtil.getProp().getProperty("usabranchId.hireemployee");
    public static final String USAMARITALSTATUSONB = PropertyUtil.getProp().getProperty("usamaritalstatus.hireemployee");
    public static final String USAVETERANSTATUSONB = PropertyUtil.getProp().getProperty("usaveteranstatus.hireemployee");
    public static final String USAHOMEADDR1PREHIRE = PropertyUtil.getProp().getProperty("usahomeaddressline1.prehire");
    public static final String USAHOMEADDR2PREHIRE = PropertyUtil.getProp().getProperty("usahomeaddressline2.prehire");
    public static final String USAHOMECITYPREHIRE = PropertyUtil.getProp().getProperty("usahomecity.prehire");
    public static final String USAEMAILTYPEECREATEPREHIRE = PropertyUtil.getProp().getProperty("usatype.createprehire");
    public static final String USANUMBOFPOSITIONS = PropertyUtil.getProp().getProperty("usanoofpositions.createpositions");
    public static final String USAHOMESTATEPREHIRE = PropertyUtil.getProp().getProperty("usahomestate.prehire");
    public static final String USAHOMEPOSTALCODEPREHIRE = PropertyUtil.getProp().getProperty("usahomepostalcode.prehire");
    public static final String USAHOMETYPEPREHIRE = PropertyUtil.getProp().getProperty("usahometype.prehire");
    //    public static final String HOMEPROVINCEPREHIRE = PropertyUtil.getProp().getProperty("homeprovince.prehire");
//    public static final String USAAVAILABILITYDATEPOSITION = PropertyUtil.getProp().getProperty("usaavailabilitydate.position");
//    public static final String USAEARLIESTDATEPOSITION = PropertyUtil.getProp().getProperty("usaearliestdate.position");

    //  Canada Hire Employee
//Hire Employee
    public static final String POSITIONCREATEPOSHIREEMP = PropertyUtil.getProp().getProperty("positioncreatepos.hireemployee");
    public static final String RECRUITSTARTDATEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("recruitstartdateJobReq.hireemployee");
    public static final String TARGETHIREDATEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("targethiredateJobReq.hireemployee");
    public static final String WORKERTYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("workertypeJobReq.hireemployee");
    public static final String REASONJOBREQHIREEMP = PropertyUtil.getProp().getProperty("reasonJobReq.hireemployee");
    public static final String EMPSUBTYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("empsubtypeJobReq.hireemployee");
    public static final String TIMETYPEJOBREQHIREEMP = PropertyUtil.getProp().getProperty("timetypeJobReq.hireemployee");
    public static final String PRIMARYLOCJOBREQHIREEMP = PropertyUtil.getProp().getProperty("primarylocJobReq.hireemployee");
    public static final String COMPANYJOBREQHIREEMP = PropertyUtil.getProp().getProperty("companyJobReq.hireemployee");
    public static final String COSTCENTERJOBREQHIREEMP = PropertyUtil.getProp().getProperty("costcenterJobReq.hireemployee");
    public static final String SUPORGHIREEMP = PropertyUtil.getProp().getProperty("suporg.hireempployee");
    public static final String REASONHIREEMP = PropertyUtil.getProp().getProperty("reason.hireemployee");
    public static final String POSHIREEMP = PropertyUtil.getProp().getProperty("position.hireemployee");
    public static final String EMPTYPEHIREEMP = PropertyUtil.getProp().getProperty("emptype.hireemployee");
    public static final String JOBPROFILEHIREEMP = PropertyUtil.getProp().getProperty("jobprofile.hireemployee");
    public static final String PAYRATETYPEHIREEMP = PropertyUtil.getProp().getProperty("parratetype.hireemployee");
    public static final String TIMETYPEHIREEMP = PropertyUtil.getProp().getProperty("timetype.hireemployee");
    public static final String LOCATIONHIREEMP = PropertyUtil.getProp().getProperty("location.hireemployee");
    public static final String COUNTRYCANADAHIRE = PropertyUtil.getProp().getProperty("country.hireempCanada");


    //Rehire
    public static final String REASONREHIREEMP = PropertyUtil.getProp().getProperty("reason.rehireemployee");
    public static final String PRIMARYLOCJOBREQREHIREEMP = PropertyUtil.getProp().getProperty("primarylocJobReq.rehireemployee");
    public static final String COMPANYJOBREQREHIREEMP = PropertyUtil.getProp().getProperty("companyJobReq.rehireemployee");
    public static final String COSTCENTERJOBREQREHIREEMP = PropertyUtil.getProp().getProperty("costcenterJobReq.rehireemployee");
    public static final String RECRUITSTARTDATEJOBREQREHIREEMP = PropertyUtil.getProp().getProperty("recruitstartdateJobReq.rehireemployee");
    public static final String TARGETHIREDATEJOBREQREHIREEMP = PropertyUtil.getProp().getProperty("targethiredateJobReq.rehireemployee");
    public static final String DEPARTMENTREHIREEMP = PropertyUtil.getProp().getProperty("department.rehireemployee");



    public static final String COUNTRYEMAIL = PropertyUtil.getProp().getProperty("country.email");
    public static final String SSNEMAIL = PropertyUtil.getProp().getProperty("ssn.email");
    public static final String SSNNUMBEMAIL = PropertyUtil.getProp().getProperty("ssnnumb.email");
    public static final String COMPANYHIREEMP = PropertyUtil.getProp().getProperty("company.hireemployee");
    public static final String COSTCENTERHIREEMP = PropertyUtil.getProp().getProperty("costcenter.hireemployee");
    public static final String BUSINESSUNITHIREEMP = PropertyUtil.getProp().getProperty("businessunit.hireemployee");
    public static final String DEPARTMENTHIREEMP = PropertyUtil.getProp().getProperty("department.hireemployee");
    public static final String GOVIDHIREEMP = PropertyUtil.getProp().getProperty("govID.hireemployee");
    public static final String SINHIREEMP = PropertyUtil.getProp().getProperty("sin.hireemployee");
    public static final String AMOUNTHIREEMP = PropertyUtil.getProp().getProperty("amount.hireemployee");
    public static final String FNEMERGENCYCONTACTONB = PropertyUtil.getProp().getProperty("FNemergencyConctOnBoard.hireemployee");
    public static final String LNEMERGENCYCONTACTONB = PropertyUtil.getProp().getProperty("LNemergencyConctOnBoard.hireemployee");
    public static final String RELATIONSHPONB = PropertyUtil.getProp().getProperty("relationShpOnB.hireemployee");
    public static final String MAILIDONB = PropertyUtil.getProp().getProperty("mailIdOnB.hireemployee");
    public static final String MOBILEONB = PropertyUtil.getProp().getProperty("mobileOnboard.hireemployee");
    public static final String CANADARACEONB = PropertyUtil.getProp().getProperty("raceOnboardCanada.hireemployee");

    public static final String EMPDOBONB = PropertyUtil.getProp().getProperty("employeeDOB.hireemployee");
    public static final String CANADABANKNAMEONB = PropertyUtil.getProp().getProperty("CANbanknameOnB.hireemployee");
    public static final String CANADABANKINSTNNUMBONB = PropertyUtil.getProp().getProperty("CANinstitutionNum.hireemployee");
    public static final String CANADABANKBRANCHIDONB = PropertyUtil.getProp().getProperty("CANbranchId.hireemployee");
    public static final String CANADABANKACCNUMBERONB = PropertyUtil.getProp().getProperty("CANaccountnum.hireemployee");
    public static final String ROUTINGTRANSITNUMBERONB = PropertyUtil.getProp().getProperty("routingTransitNbrOnB.hireemployee");
    public static final String BANKIDNUMBERONB = PropertyUtil.getProp().getProperty("bankIdentificationCodeOnB.hireemployee");
    public static final String USBANKNAMEONB = PropertyUtil.getProp().getProperty("USbanknameOnB.hireemployee");
    public static final String USBANKINSTNNUMBONB = PropertyUtil.getProp().getProperty("USinstitutionNum.hireemployee");

    public static final String HOMEADDR1PREHIRE = PropertyUtil.getProp().getProperty("homeaddressline1.prehire");
    public static final String HOMEADDR2PREHIRE = PropertyUtil.getProp().getProperty("homeaddressline2.prehire");
    public static final String HOMECITYPREHIRE = PropertyUtil.getProp().getProperty("homecity.prehire");
    public static final String HOMEPROVINCEPREHIRE = PropertyUtil.getProp().getProperty("homeprovince.prehire");
    public static final String HOMEPOSTALCODEPREHIRE = PropertyUtil.getProp().getProperty("homepostalcode.prehire");
    public static final String HOMETYPEPREHIRE = PropertyUtil.getProp().getProperty("hometype.prehire");
    public static final String AVAILABILITYDATEPOSITION = PropertyUtil.getProp().getProperty("availabilitydate.position");
    public static final String EARLIESTDATEPOSITION = PropertyUtil.getProp().getProperty("earliestdate.position");
    //parratetype.hireemployee

    //Pre hire
    public static final String FNAMECREATEPREHIRE = PropertyUtil.getProp().getProperty("fname.createprehire");
    public static final String LNAMECREATEPREHIRE = PropertyUtil.getProp().getProperty("lname.createprehire");
    public static final String EMAILCREATEPREHIRE = PropertyUtil.getProp().getProperty("email.createprehire");
    public static final String EMAILTYPEECREATEPREHIRE = PropertyUtil.getProp().getProperty("type.createprehire");

    public static final String PATH = System.getProperty("user.dir")+ PropertyUtil.getProp().getProperty("prj.path");

    public static final String NUMBOFPOSITIONS = PropertyUtil.getProp().getProperty("noofpositions.createpositions");

    //USA
    public static final String USADDRESSLINE1PREHIRE = PropertyUtil.getProp().getProperty("usaaddressline1.prehire");
    public static final String USADDRESSLINE2PREHIRE = PropertyUtil.getProp().getProperty("usaaddressline2.prehire");



    //Change Job --------------------------------------------------------------
    public static final String CURRENCYCHANGEJOB = PropertyUtil.getProp().getProperty("currency.changejob");
    public static final String FREQUENCYCHANGEJOB = PropertyUtil.getProp().getProperty("frequency.changejob");
    public static final String JOBCHANGEREASONCHANGEJOB = PropertyUtil.getProp().getProperty("jobchangereason.changejob");
    public static final String JOBCHANGEREASONINTERN = PropertyUtil.getProp().getProperty("jobchangereason.Intern");



    //Close Position -----------------------------------------------------------
    public static final String POSITION = PropertyUtil.getProp().getProperty("position.closeposition");
    public static final String SRCHCLOSEPOSITION = PropertyUtil.getProp().getProperty("search.closeposition");

    //Manage Goals
    public static final String GOALMANAGEGOALS = PropertyUtil.getProp().getProperty("goal.addgoals");
    public static final String DESCRIPTIONMANAGEGOALS = PropertyUtil.getProp().getProperty("description.addgoals");


    //Close Job Requisition
    public static final String SRCHCLOSEJOBREQ = PropertyUtil.getProp().getProperty("search.closejobrequestion");

    //Rescind
    public static final String COMMENTFORRESCIND = PropertyUtil.getProp().getProperty("comment.rescind");


    //Exception Strings

    public static final String TEXT_COMPLETE = "complete";

    public static final String GENERIC_EXCEPTION_OCCURRED = "Generic Exception occurred: ";

    public static final String CHECK_IF_ELEMENT_IS_VISIBLE = "Check if element is visible.";

    public static final String ELEMENT_NOT_FOUND = "Element not found: {}";

    public static final String TIMEOUT_EXCEPTION = "Timeout reached when searching for element!";

    public static final String DATA_FILE_NOT_FOUND_EXCEPTION = "FileNotFoundException";

    public static final String MSG_IOEXCEPTION = "IOException";

    public static final String NO_USERDATA = "No UserData avaialable";

    //file path locations

    public static final String USERDATA_CSV_PATH = "data/static/userdata.csv";

    public static final String PUNCH_CSV_PATH = "data/static/defaultpunchdata.csv";

    public static final String PUNCH_OUTPUT_CSV_PATH = "data/static/defaultsummarydata.csv";

    public static final String MAIL_HOST = "mail4.homedepot.com";

    public static final String MAIL_PORT = "25";
}
