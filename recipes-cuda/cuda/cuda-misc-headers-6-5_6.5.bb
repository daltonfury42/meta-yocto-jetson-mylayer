SUMMARY = "${PN} ${PV} "
DESCRIPTION = "Add later if you have time."
LICENSE = "CLOSED"

SRC_URI = "file:///run/media/fury/storage/yocto/poky/meta-yocto-jetson-mylayer/recipes-cuda/cuda/cuda-repo-6-5-prod/${PN}_${PV}-42_armhf.deb;subdir=output"

S = "${WORKDIR}/output"

inherit bin_package

INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "ldflags"

#FILES_${PN} = "/"

#ALLOW_EMPTY_${PN} = "1"
