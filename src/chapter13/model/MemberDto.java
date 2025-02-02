package chapter13.model;

public class MemberDto {
    public String name;
    public String phone;
    public String email;

    public MemberDto() {
    }

    public MemberDto(String name) {
        this.name = name;
    }

    public MemberDto(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public MemberDto(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDto getMemberDto() {
        MemberDto dto = new MemberDto();
        return dto;
    }

    public String toString() {
        return name + ", " + phone + ", " + email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MemberDto other = (MemberDto) obj;

        if(name == null) {
            if(other.name != null) {
                return false;
            }
        } else if(!name.equals(other.name)) {
            return false;
        }
        if(phone == null) {
            if(other.phone != null) {
                return false;
            }
        } else if(!phone.equals(other.phone)) {
            return false;
        }

        if(email == null) {
            if(other.email != null) {
                return false;
            }
        } else if(!email.equals(other.email)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }
}
