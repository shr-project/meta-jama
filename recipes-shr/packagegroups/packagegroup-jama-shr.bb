DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup allarch

PR = "r20"

RPROVIDES_${PN} += "task-jama-shr"
RREPLACES_${PN} += "task-jama-shr"

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
estardict \
terminology \
linux-firmware-sd8686 \
packagegroup-jama \
fso-sounds \
fsoraw \
ffalarms \
ntp-systemd \
"
