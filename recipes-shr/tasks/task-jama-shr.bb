DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit task allarch

PR = "r15"

PACKAGES = "\
  ${PN} \
"

MISSING = "\
openmoko-agpsui \
openbmap-logger \
cellhunter \
shr-theme-neo \
"
FAILING = "\
shr-theme-efenniht \
"
#stopwatch \
#wpa-gui \
#paroli \

RDEPENDS_${PN} = "\
task-jama \
fso-sounds \
fsoraw \
ffalarms \
ntp-systemd \
"
