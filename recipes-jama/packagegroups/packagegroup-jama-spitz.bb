DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup allarch

PR = "r1"

RPROVIDES_${PN} += "task-jama-spitz"
RREPLACES_${PN} += "task-jama-spitz"
RCONFLICTS_${PN} += "task-jama-spitz"

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
packagegroup-jama \
packagegroup-x11-illume \
"
