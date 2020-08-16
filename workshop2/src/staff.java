
public class staff 
{
	@Override
	public String toString() {
		return "staff [strid=" + strid + ", strname=" + strname + ", strpwd=" + strpwd + ", strgender=" + strgender
				+ ", strdob=" + strdob + ", strmbno=" + strmbno + ", strpin=" + strpin + ", stremail=" + stremail + "]";
	}

	public staff(String strid, String strname, String strpwd, String strgender, String strdob, String strmbno,
			String strpin, String stremail) {
		super();
		this.strid = strid;
		this.strname = strname;
		this.strpwd = strpwd;
		this.strgender = strgender;
		this.strdob = strdob;
		this.strmbno = strmbno;
		this.strpin = strpin;
		this.stremail = stremail;
	}

	String strid, strname,strpwd,strgender,strdob, strmbno, strpin, stremail;

	public String getStrid() {
		return strid;
	}

	public void setStrid(String strid) {
		this.strid = strid;
	}

	public String getStrname() {
		return strname;
	}

	public void setStrname(String strname) {
		this.strname = strname;
	}

	public String getStrpwd() {
		return strpwd;
	}

	public void setStrpwd(String strpwd) {
		this.strpwd = strpwd;
	}

	public String getStrgender() {
		return strgender;
	}

	public void setStrgender(String strgender) {
		this.strgender = strgender;
	}

	public String getStrdob() {
		return strdob;
	}

	public void setStrdob(String strdob) {
		this.strdob = strdob;
	}

	public String getStrmbno() {
		return strmbno;
	}

	public void setStrmbno(String strmbno) {
		this.strmbno = strmbno;
	}

	public String getStrpin() {
		return strpin;
	}

	public void setStrpin(String strpin) {
		this.strpin = strpin;
	}

	public String getStremail() {
		return stremail;
	}

	public void setStremail(String stremail) {
		this.stremail = stremail;
	}

}
