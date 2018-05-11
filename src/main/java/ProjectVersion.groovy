class ProjectVersion {
    private int major
    private int minor

    ProjectVersion(int major, int minor) {
        this.major = major
        this.minor = minor
    }

    int getMajor() {
        major
    }

    void setMajor(int major) {
        this.major = major
    }

    int getMinor() {
        minor
    }

    void setMinor(int minor) {
        this.minor = minor
    }
}

ProjectVersion pv = new ProjectVersion(1, 2)
println pv.major
println pv.minor
println pv.getMajor()